/*
Priyanka and Her Crush
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Khusboo found a love letter in the class that her friend Priyanka has written to her boyfriend Khusboo is a prankster, so she decides to meddle with the letter. She changes all the words in the letter
into palindromes.
To do this, she follows two rules:
1. She can only reduce the value of a letter by 1, i. e. she can changed to c, but he cannot change c to d or d to b.
2. The letter may not be reduced any further.
Each reduction in the value of any letter is counted as a single operation. Help Khusboo to find minimum number of operations required to convert a given string into a palindrome.
Example
s = cde
The following two operations are performed: cde → cdd → cdc. Return 2.
string s: the text of the letter
Input
The first line contains an integer the number of queries.
The next lines will each contain a string. m

Constraints
1 < q < 10
1 < s < 104
Output
Print the no. of operations integer in one line. */

#include <stdio.h> // header file for Standard Input Output
#include <stdlib.h> // header file for Standard Library

int main(void) {
    char a[10002];
    int i,temp,count=0,mid;
    int start=0,end;
    int t,z=0;
    scanf("%d",&t);
    while(z<t)
    {
        count=0;
        start=0;
        scanf("%s",a);
        i=0;
        while(a[i]!='\0')
        {
            count++;
            i++;
        }
        end=count-1;
        start=0;
        mid=count/2;
        count=0;
        temp=0;
        for(;start<mid;)
        {
            if(a[start]==a[end])
            {
                start++;
                end--;
            }
            else
            {
                if(a[start]>a[end])
                {
                temp=a[start]-a[end];
                count=count+temp;
                start++;
                end--;
            }
            else if(a[end]>a[start])
            {
                temp=a[end]-a[start];
                count=count+temp;
                start++;
                end--;
            }
        }
    }
    //Your code here
    printf("%d",count);
    z++;
    printf("\n");
}
    return 0;
}