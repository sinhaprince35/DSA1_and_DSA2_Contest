/*
It's Birthday
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Bob has a string S of lowercase alphabets of size N. He want to gift this string to Alice since today is her birthday. But Alice will accept the string only when its length is N - K. So Bob will delete K characters from the string. Bob want to gift the largest string obtained in Dictionary order to Alice. Find that string.
In other terms, find the largest string in dictionary order that can be obtained by deleting K characters from S. Given that K < |S|.
Input
First line contains an integer N - the length of string
The next line contains a string S
The last line contains an integer K denoting the number of characters to be removed.

Constraints
1<= N <= 10000
0<= K < N
Output
Print a single line containing a string after deleting k characters and fulfilling above conditions. */


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc=new Scanner (System.in);
        int N=sc.nextInt();
        String S=sc.next();
        int K=sc.nextInt();
        String result=largetString(N,K,S);
        System.out.println(result);
    }
    public static String largetString(int N, int K, String S){
        char []arr=S.toCharArray();
        if(N-K==1){
            Arrays.sort(arr);
            String ans="";
            ans+=arr[N-1];
            return ans;
        }
        Deque<Character> dq=new ArrayDeque<>();
        for(int i=0;i<N;i++){
            while(dq.size()>0 && dq.getLast()<arr[i] && K>0){
                dq.pollLast();
                K--;
            }
            dq.add(arr[i]);

        }
        String ans="";
        for(char c:dq){
            ans +=Character.toString(c);
        }
        return ans;
    }   
    }