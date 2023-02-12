/*
Max Profit
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
The cost of stock on each day is given in an array A[] of size N. If you can only perform at most two transactions what is the maximum profit you can gain.

Note:- The second transaction can only start after the first one is complete (Sell- >buy- >sell- >buy).
Input
The first line of input contains a single integer N. The next line of input contains N space-separated integers depicting the values of A[].

Constraints:-
2 <= N <= 10000
1 <= A[i] <= 1000000000
Output
Print the maximum profit gain in at most two transactions. */

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long arr[]=new long[n];
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print(maxProfit(arr));
    }
    public static long maxProfit(long prices[])
    {
        long sell1=0, sell2=0, buy1=Long.MIN_VALUE,
        buy2=Long.MIN_VALUE;
        for(int i=0; i<prices.length;i++)
        {
            buy1=Math.max(buy1,-prices[i]);
            sell1=Math.max(sell1,buy1+prices[i]);
            buy2=Math.max(buy2,sell1-prices[i]);
            sell2=Math.max(sell2,buy2+prices[i]);
        }
        return sell2;
    }
}