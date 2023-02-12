/*
Longest substring (contest)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given a string of length N consisting of lowercase english alphabets(a-z), in which you are allowed to change at most k consonants into a vowel (a, e, i, o, u).
Find the longest substring that consists of only vowels after changing at most k consonants into vowels.
Input
First line of input consists of two integers N and k.
Second line consists of a string of length N.

Constraints:-
0 <= N <= 10^5
0 <= k <= N

String will contain only lowercase english letters
Output
A single integer showing the length of the longest substring consisting of only vowels. */

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
       int res = 0;
       for (int i=0;i<n;i++){
           int count = 0,flag=0;
           for(int j=i;j<n;j++){
               char c=s.charAt(j);
               if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
               count++;
               else if(flag<k){
                   count++;
                   flag++;
               }
               else{
                   break;
           }
           }
           res=Math.max(res,count);
           if(res>=(n-(i+1)))
           break;
       }
        System.out.println(res);
        sc.close();
    }
}