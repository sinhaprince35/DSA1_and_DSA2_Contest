/*
Cyclic Left Shift
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a number N in decimal form, you have to cyclically rotate left the binary representation of number N in 31 bit, you get the maximum number that can be formed.
Note:- All the leftover bits in binary representation of N are filled with zeroes i.e binary representation of 4 will be :- 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0
Input
The input contains T, denoting the number of testcases. Each testcase contains a number N.

Constraints:
1 <= T <= 100
1 <= N <= (2^32)-1
Output
For each testcase in new line print the maximum number formed. */

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int bit=32;
        while(t-- >0){
            int n=sc.nextInt();
            long val=n;
            long max=n;
            for(int i=1;i<=32;i++){
                val=(n<<i) | (n>>(bit-i));
                if(val>max)
                max=val;
            }
            System.out.println(max*2);
        }
    }
}