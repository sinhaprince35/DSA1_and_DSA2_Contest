/*
Weird Series (Contest)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
We define a weird series as follows:
7, 77, 777, 7777, 77777, 777777,. .
Given a positive integer N find where is first occurrence of a number divisible by N in the given series.
If the series contains no multiple of N, print -1 instead.
Input
Input contains a single integer N.

Constraints:
1 <= N <= 1000000
Output
Print the position of the first position of a multiple of N in the series. (For example, if the first occurrence is the third element of the series, print 3) */

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        int count = 0;
        for(int  i = 1; i < n; i++)
        {
            x = x * 10;
            x = x + 7;
            x %= n;
            if(x == 0)
            {
                System.out.println(i);
                count++;
                break;
            }
        }
        x %= n;
        if(count == 0)
        {
           System.out.print(-1);
        }
    }
}