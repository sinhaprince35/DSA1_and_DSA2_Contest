/*
Too Close (Contest)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given an array A of size N. You need to find the integer not present in this array that is closest to K. The closeness between two numbers A[i] and A[j] is defined as abs(A[i] - A[j]).

For Example:
For given array A = [1,2,5,6,13]
For given K = 12
Output: 12

Explanation: numbers missing 3, 4, 7,8, 9, 10, 11, 12, 14, 15....
and K = 12, so distance from each missing number is (3,9), (4,8), ....
where every pair denotes (missing number, distance) hence 12 is answer.
Input
The first line of the input contains two integers N and K.

Constraints
1 <= N <= 1000
1 <= A[i] <= 10000
1 <= K <= 10000

(The array may not contain all distinct numbers)
Output
Output the required closest number. */

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
         Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++)
        {
            set.add(arr[i] = sc.nextInt());
        }
        int add = 1;
        while(k >= 0)
        {
            if(set.contains(k) == false)
            {
                System.out.print(k);
                break;
            }
            else if(set.contains(k - add) == false)
            {
                System.out.print(k - add);
                break;
            }
            else if(set.contains(k + add) == false)
            {
                System.out.print(k + add);
                break;
            }
            add++;
        }
    }
}