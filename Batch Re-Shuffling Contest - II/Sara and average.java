/*
Sara and average
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Sara wants to be the best programmer in the world. To help Sara her friend Rahul gave her a problem:-
Rahul gave Sara a stream of integers of size N and ask if she can give the average for every window of size W.. If the stream has lesser element than W then print the average of those integers.
Input
First line of input contains the size of stream N and the window size W. Next line contains N space-separated integers denoting the stream.

Constraints:-
1 <= W <= N <= 100000
1 < element <= 100000
Output
Print N elements separated by spaces the floor of average of window as shown in example. */

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    // Your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++){
        arr[i]=sc.nextInt();
    }
    int sum = 0;
    for(int i = 0; i < n; i++){
        sum = sum + arr[i];
        if(i + 1 <= a){
            System.out.print(sum/(i+1)+" ");
        }
        else{
            sum = sum - arr[i-a];
            System.out.print(sum/a + " ");
        }
    }
    }
}