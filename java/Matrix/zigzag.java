// Given 1's, 2's, 3's ....k's print them in zig zag way.
// Given number of rows and columns. And given number of 1's, 2's, 3's ....k's which needs to be printed. Print them in a zig-zag way.
// It is guaranteed that n*m = number of 1's + 2's + 3's + .... + k's

// Examples:

// Input :  2 3
//          2 1 2 1
// Output : 1 1 2
//          4 3 3
// Explanation :
// Here number of rows are 2 and number of columns are 3
// and number of 1's are 2
//     number of 2's are 1
//     number of 3's are 2
//     number of 4's are 1
//     -----------
//    | 1 | 1 | 2 |
//    | 3 | 3 | 4 | but is to be printed in zigzag manner.
//     -----------

// Input :  4 3
//          2 4 3 1 2
// Output : 1 1 2
//          2 2 2
//          3 3 3
//          5 5 4
// Explanation :
// Here number of rows are 4 and number of columns are 3
// and number of 1's are 2
//     number of 2's are 4 [Note that 2s are printed in]
//     number of 3's are 3 [zig zag manner]
//     number of 4's are 1
//     number of 5's are 2

// Approach: We make a two-dimensional array to store all the elements in zig-zag way. 
// we will traverse through all the elements of array of numbers and insert all the numbers of array of 
// i-th index into two-dimensional array until it becomes zero.

import java.util.*; 
import java.lang.*;  
public class Matrix{       
    // function that prints given number of 1's, 2's, 3's ....k's in zig-zag way. 
    public static void zigzag(int rows, int columns, int numbers[]){ 
        int k = 0;       
        // two-dimensional array to store numbers.  
        int[][] arr = new int[rows][columns];       
        for (int i=0;i<rows;i++){ 
            // for even row. 
            if (i % 2 == 0){ 
                // for each column. 
                for (int j=0;j<columns && numbers[k]>0; j++){ 
                    // storing element. 
                    arr[i][j] = k+1;   
                    // decrement element at  
                    // kth index.  
                    numbers[k]--;                   
                    // if array contains zero 
                    // then increment index to  
                    // make this next index 
                    if (numbers[k] == 0) 
                        k++; 
                } 
            }           
            // for odd row. 
            else{ 
                // for each column. 
                for (int j=columns-1; j>=0 && numbers[k]>0; j--){ 
                    // storing element. 
                    arr[i][j] = k+1;                   
                    // decrement element  
                    // at kth index. 
                    numbers[k]--;                   
                    // if array contains zero then  
                    // increment index to make this  
                    // next index. 
                    if (numbers[k]==0) 
                        k++; 
                } 
            } 
        } 
      
        // printing the stored elements. 
        for (int i=0;i<rows;i++){ 
            for (int j=0;j<columns;j++) 
                System.out.print(arr[i][j] + " ");               
            System.out.println(); 
        } 
    }       
     
    public static void main(String args[]){ 
        int rows = 4; 
        int columns = 5; 
        int[] Numbers = new int[]{3, 4, 2, 
                                  2, 3, 1, 5}; 
        zigzag(rows, columns, Numbers);  
    } 
} 