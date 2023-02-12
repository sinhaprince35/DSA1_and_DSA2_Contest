/*
Magic number
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
A magic number is a natural number that contains both the digits 7 and 9 in it. For eg:- 79, 879, 53729 etc.
Given a number N, your task is to find the closest Magic number from the given number N.

Note:- If more than one answer exists return the minimum one
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function MagicNumber() that takes integer N as argument.

Constraints:-
1 <= N <= 100000
Output
Return a magic number closest to the given number N. */

static int MagicNumber(int N){
    //Enter your code here
    int i=0;
    while(check(N-i)==true && check(N+i)==true){
        i++;
    }
    if(check(N-i)==false){
        return N-i;
    }
    else
    {
        return N+i;
    }
    }
    static boolean check(int N){
        boolean s=false;
        boolean p=false;
        while(N>0){
            if(N%10==7){
                s=true;
            }
            if(N%10==9){
                p=true;
            }
            N=N/10;
        }
        if(s && p){
            return false;
        }
        return true;
    }