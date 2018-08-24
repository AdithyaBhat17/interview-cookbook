package sort;

import java.util.Arrays;

public class BubbleSort {
    /*
     * 1. Bubble sort is the simplest sorting algorithm that compares two adjacent elements in an array and swaps the largest of the two values to  the end.
     * 2. The worst case time complexity of bubble sort is O(n2): this is because for each iteration n-1 comparisons will be done.
     * 3. The best case  time complexity will be O(n): this is when the list is already sorted
     * 4. The space time complexity will be O(1): since only one memory space is required for the temp variable.
     * 
     * Key Points
     * -> Bubble sort is in place and stable sorting algorithm.
     * */
    public static int[] bubbleSort(int[] arr) {
        if(arr.length == 1) return arr;

        for(int i=0; i<arr.length-1; i++) {

            for(int j=0; j<arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr = {55, 23, 26, 2, 25};
        System.out.print(Arrays.toString(bubbleSort(arr)));
    }
}
/*
The above function always runs O(n^2) time even if the array is sorted.
 It can be optimized by stopping the algorithm if inner loop didn’t cause any swap.
 // An optimized version of Bubble Sort
 static void bubbleSort(int arr[], int n)
 {
     int i, j, temp;
     boolean swapped;
     for (i = 0; i < n - 1; i++) 
     {
         swapped = false;
         for (j = 0; j < n - i - 1; j++) 
         {
             if (arr[j] > arr[j + 1]) 
             {
                 // swap arr[j] and arr[j+1]
                 temp = arr[j];
                 arr[j] = arr[j + 1];
                 arr[j + 1] = temp;
                 swapped = true;
             }
         }

         // IF no two elements were 
         // swapped by inner loop, then break
         if (swapped == false)
             break;
     }
 }*/
