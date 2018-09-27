// Rotate Matrix Elements
// Given a matrix, clockwise rotate elements in it.
// Examples:

// Input
// 1    2    3
// 4    5    6
// 7    8    9

// Output:
// 4    1    2
// 7    5    3
// 8    9    6

// For 4*4 matrix
// Input:
// 1    2    3    4    
// 5    6    7    8
// 9    10   11   12
// 13   14   15   16

// Output:
// 5    1    2    3
// 9    10   6    4
// 13   11   7    8
// 14   15   16   12

// The idea is to use loops similar to the program for printing a matrix in spiral form. 
// One by one rotate all rings of elements, starting from the outermost. To rotate a ring, we need to do following.
//     1) Move elements of top row.
//     2) Move elements of last column.
//     3) Move elements of bottom row.
//     4) Move elements of first column.
// Repeat above steps for inner ring while there is an inner ring.

class Matrix{
    // initialize the number of rows and columns.
    static int R = 4; 
    static int C = 4; 

    static void rotateMatrix(int m, int n, int[][] matrix){
        int row = 0, col = 0;
        int prev, curr;
        /* 
        row - Staring row index 
        m - ending row index 
        col - starting column index 
        n - ending column index
        */
        while(row < m && col < n){
            if(row + 1 == m || col + 1 == n)
                break;
            // Store the first element of next row, this element will replace first element of current row 
            prev = matrix[row + 1][col];
            // Move elements of first row from the remaining rows  
            for(int i=col;i<n;i++){
                curr = matrix[row][i];
                matrix[row][i] = prev;
                prev = curr;
            }
            row++;

            // Move elements of last column from the remaining columns 
            for(int i=row;i<m;i++){
                curr = matrix[i][n-1];
                matrix[i][n-1] = prev;
                prev = curr;
            }
            n--;

            // Move elements of last row from the remaining rows
            if(row < m){
                for(int i=n-1;i>=col;i--){
                    curr = matrix[m-1][i];
                    matrix[m-1][i] = prev;
                    prev = curr;
                }  
            }
            m--;
            

            // Move elements of first column from the remaining columns
            if(col < n){
                for(int i=m-1;i>=row;i--){
                    curr = matrix[i][col];
                    matrix[i][col] = prev;
                    prev = curr;
                }  
            }
            col++;
        }
        // Print rotated matrix 
        for (int i = 0; i < R; i++){ 
            for (int j = 0; j < C; j++) 
                System.out.print( matrix[i][j] + " "); 
            System.out.println(); 
        } 
    }

    public static void main(String[] args){
        int array[][] = {{1, 2, 3, 4},
                         {5, 6, 7, 8},
                         {9, 10, 11, 12},
                         {13, 14, 15, 16}
                        };
        rotateMatrix(R, C, array);
    }
}