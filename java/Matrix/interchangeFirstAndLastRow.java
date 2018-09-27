// Interchange elements of first and last rows in matrix
// Given a 4 x 4 matrix, we have to interchange the elements of first and last row and show the resulting matrix.

// Examples :

// Input : 3 4 5 0
//         2 6 1 2
//         2 7 1 2
//         2 1 1 2
// Output : 2 1 1 2
//          2 7 1 2
//          2 6 1 2
//          3 4 5 0

// Input : 9 7 5 1
//         2 3 4 1
//         5 6 6 5
//         1 2 3 1
// Output : 1 2 3 1
//          2 3 4 1
//          5 6 6 5
//          9 7 5 1

// The approach is very simple, we can simply swap the elements of first and last row of the matrix inorder to get the desired matrix as output.

import java.io.*;   
public class Matrix{       
    static void interchangeFirstLast(int matrix[][]) { 
        int rows = matrix.length;           
        // swapping of element between first 
        // and last rows 
        for (int i=0;i<matrix[0].length;i++){ 
            int t = matrix[0][i]; 
            matrix[0][i] = matrix[rows-1][i]; 
            matrix[rows-1][i] = t; 
        } 
    } 
      
    public static void main(String args[]) throws IOException { 
        // input in the array 
        int matrix[][] = { { 3, 4, 5, 0 }, 
                            { 4, 7, 6, 5 }, 
                            { 3, 2, 1, 8 }, 
                            { 2, 2, 1, 2 }
                         };                        
        interchangeFirstLast(matrix);            
        // printing the interchanged matrix 
        for (int i = 0; i < matrix.length; i++) { 
            for (int j = 0; j < matrix[0].length; j++)  
                System.out.print(matrix[i][j] + " "); 
            System.out.println(); 
        } 
    } 
} 