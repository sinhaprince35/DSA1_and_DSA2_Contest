/*
Bubble sort in pair array
easy
Problem Statement
Given an array of n pairs of integers. Your task is to sort the array on the basis of the first element of pairs in descending order. If the first element is equal in two or more pairs then give preference to the pair that has a greater second element value.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function SortPair() that takes the array of pairs and the integer N(size of the array) as a parameter.

Custom Input
The first line of input will be a single integer N. The next line of input contains 2*N space-separated integers where unique adjacent elements are pairs. Custom input for 1st sample:-
4
1 2 3 4 5 6 7 8

Constraints:-
1<=N<=103
1<=value<=105
Output
Return the sorted array of pairs.
Example
Sample Input 1:
4
(1, 2), (3, 4), (5, 6), (7, 8)

Sample Output 1:
(7, 8), (5, 6), (3, 4), (1, 2)

Sample Input 2:
3
(1, 1), (2, 2), (3, 3)

Sample Output 2:
(3, 3), (2, 2), (1, 1)

Sample Input 3:
3
(1, 1), (1, 2), (3, 3)

Sample Output 3:
(3, 3), (1, 2), (1, 1)

Explanation :
(1,2) and (1,1) have the same first element. But (1,2) has a greater second element so (1,2) comes before (1,1) in a sorted array. */


/*
class Pair { 
    int x; 
    int y; 
  
    // Constructor 
public Pair(int x, int y) 
    { 
        this.x = x; 
        this.y = y; 
    } 
} 
*/ 

static Pair[] SortPair(Pair arr[], int n)  { 
    //enter your code here
    for(int i=0;i<arr.length-1;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i].x<arr[j].x){
                Pair temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
    for(int i=0;i<arr.length-1;i++){
        if(arr[i].x==arr[i+1].x){
            if(arr[i].y<arr[i+1].y){
                Pair temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
    }
    return arr;
    }