/*
Triangles
medium
hint
Hint

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Tom has N sticks that are distinguishable from each other. The length of the i-th stick is L[i]. He is going to form a triangle using three of these sticks. Let a, b, and c be the lengths of the three sticks used. Here, all of the following conditions must be satisfied:

a < b+c
b < c+a
c < a+b

How many different triangles can be formed? Two triangles are considered different when there is a stick used in only one of them.
Input
The first line of input contains the number of sticks N, the next line contain N space separated integer where the ith integer shows the length of ith stick.

Constraints:-
3 ≤ N ≤ 1000
1 ≤ L[i] ≤ 1000
Output
Print the number of different triangles that can be formed. */

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] arr=new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        int tringle=noOfTringles(arr);
        System.out.println(tringle);
    }
    public static int noOfTringles(int[] arr){
        int N=arr.length;
        Arrays.sort(arr);
        int count=0;
        for(int i=N-1;i>=1;i--)
        {
            int k=0;
            int j=i-1;
            while(k<j)
            {
                if(arr[k]+arr[j]>arr[i]){
                    count+=j-k;
                    j--;}
                    else{
                    k++;
                }
            }
        }
        return count;
    }
}