// Given a n x n matrix. The problem is to sort the given matrix in strict order. Here strict order means that matrix is 
// sorted in a way such that all elements in a row are sorted in increasing order and for row `i`, where 1 <= i <= n-1, 
// first element of row 'i' is greater than or equal to the last element of row 'i-1'.

// Examples:

// Input : mat[][] = { {5, 4, 7},
//                     {1, 3, 8},
//                     {2, 9, 6} }
// Output : 1 2 3
//          4 5 6
//          7 8 9

// Approach: Create a temp[] array of size n^2. 
// Starting with the first row one by one copy the elements of the given matrix into temp[]. 
// Sort temp[]. Now one by one copy the elements of temp[] back to the given matrix.

import java.io.*;
import java.util.*;

class Matrix{
    // static int SIZE = 10;
    static void sortMatrix(int[][] matrix, int n){
        // copy the elements of the matrix to the temp array
        int[] temp = new int[n*n];
        int k = 0;
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                temp[k++] = matrix[i][j];

        // now sort all the elements of the temp array and copy them back to the matrix.
        Arrays.sort(temp);
        k = 0;
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                matrix[i][j] = temp[k++];
    }

    static void printMatrix(int[][] matrix, int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String args[]){
        int matrix[][] = {{5, 4, 7},
                          {1, 3, 8},
                          {2, 9, 6}
                         };
        int n = 3;
        System.out.println("Given matrix : ");
        printMatrix(matrix, n);
        sortMatrix(matrix, n);
        System.out.println("Sorted matrix : ");
        printMatrix(matrix, n);
    }
}