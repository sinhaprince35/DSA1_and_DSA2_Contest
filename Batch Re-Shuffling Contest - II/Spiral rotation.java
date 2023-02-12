/*
Spiral rotation
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
There has been an attack on SHIELD. Nick Fury has given you the responsibility of protecting all the information but during the chaos he forgot to tell you how to login into the classified information. Just then a “secret code” appears on the screen.

Print the information in a 2D integer array of size (N x M) in a spiral form. That is, you need to print in the order followed for every iteration:
a. First row(left to right)
b. Last column(top to bottom)
c. Last row(right to left)
d. First column(bottom to top)
Mind that every element will be printed only once.
Input
The first line of input contains two integers N and M, the next N lines of input contains M space- separated integers each depicting the values of the matrix.

Constraints:-
2 <= N, M <= 500
1 <= Matrix[][] <= 1000000
Output
Print the matrix in spiral form as shown in the example. */

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc=new Scanner(System.in);
        int M,N;
        M=sc.nextInt();
        N=sc.nextInt();
        int [][]arr=new int[M][N];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        Spiral(M,N,0,0,arr);
    }
    public static void Spiral(int M,int N,int i,int j,int[][] matrix){
        if(i>=M||j>=N){
            return;
        }
        for(int p=i;p<N;p++){
            System.out.print(matrix[i][p]+" ");
        }
        for(int p=i+1;p<M;p++){
            System.out.print(matrix[p][N-1]+" ");
        }
        if((M-1)!=i){
            for(int p=N-2;p>=j;p--){
                System.out.print(matrix[M-1][p]+" ");
            }
        }
        if((N-1)!=j){
            for(int p =M-2;p>i;p--){
                System.out.print(matrix[p][j]+" ");
            }
        }
        Spiral(M-1,N-1,i+1,j+1,matrix);
    }
}