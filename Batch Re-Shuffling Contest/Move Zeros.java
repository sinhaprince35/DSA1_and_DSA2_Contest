/*
Move Zeros
easy
asked in interviews by 8 companies
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array A[] of size N containing non-negative integers. You have to move all 0's to the end of array while maintaining the relative order of the non-zero elements.

Note:
You must do this in-place without making a copy of the array.
Minimize the total number of operations.
Input
The first line of input line contains T, denoting the number of testcases. Each test cases contains 2 lines. First-line contains N, size of array. Second-line contains elements of array separated by space.

Constraints:
1 <= T <= 100
1 <= N <= 10^5
1 <= A[i] <= 10^5

Sum of N over all testcases does not exceed 10^6
Output
For each testcase you need to print the updated array.
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String [] args) {
                      // Your code here
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t-->0){
                int s=sc.nextInt();
                int[] nums=new int[s];
                for(int i=0;i<s;i++){
                    nums[i]=sc.nextInt();
                }
                replaceZeros(nums);
                for(int num:nums){
                    System.out.print(num+" ");
                }
                System.out.println();
            }
    }
    public static void replaceZeros(int[] nums){
        int p1=0;
        int p2=0;
        int count=0;
        while(p1<nums.length){
            if(nums[p1]==0){
                p1++;
                count++;

            }else{
                nums[p2]=nums[p1];
                p1++;
                p2++;
            }

        }
        for (int i=0;i<count;i++){
            nums[p2]=0;
            p2++;
        }
    }
}