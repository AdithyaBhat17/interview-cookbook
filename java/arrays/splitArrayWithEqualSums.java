/*
Asked by - Facebook.

Given an array of integers greater than zero, find if it is possible to split it in two subarrays
(without reordering the elements), such that the sum of the two subarrays is the same. 
Print the two subarrays.

Examples :

Input : Arr[] = { 1 , 2 , 3 , 4 , 5 , 5  }
Output :  { 1 2 3 4 } 
          { 5 , 5 }

Input : Arr[] = { 1 , 2 ,3 , 4 }
Output : Not Possible 
*/

import java.util.Scanner;

class Array{
    public static int findSplitPoint(int array[],int n){
        int leftSum = 0;
        for(int i=0;i<n;i++){
            //add first element to the sum.
            leftSum += array[i];

            int rightSum = 0;
            //add rest to the rightsum.
            for(int j=i+1;j<n;j++)
                rightSum += array[j];
            
            if(leftSum == rightSum) // check if both the sums are equal
                return i+1; // return index if true.
        }
        return -1; // if not possible to split the array.
    }
    public static void splitArray(int array[],int n){
        int splitIndex = findSplitPoint(array,n);
        if(splitIndex == -1 || splitIndex == n){
            System.out.println("Not Possible");
            return;
        }
        for(int i=0;i<n;i++){
            if(splitIndex == i)
                System.out.println();
            System.out.print(array[i] + " ");
        }        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for(int i=0;i<n;i++)
            array[i] = sc.nextInt();
        splitArray(array, n);
    }
}