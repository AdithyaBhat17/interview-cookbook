// Program to check if a matrix is symmetric
// A square matrix is said to be symmetric matrix if the transpose of the matrix is same as the given matrix. 
// Symmetric matrix can be obtain by changing row to column and column to row.

// Examples:

// Input : 1 2 3
//         2 1 4
//         3 4 3
// Output : Yes

// Input : 3 5 8
//         3 4 7
//         8 5 3
// Output : No

// A Simple solution is to do following.
// 1) Create transpose of given matrix.
// 2) Check if transpose and given matrices are same or not

// An Efficient solution to check a matrix is symmetric or not is to compare matrix elements without creating a transpose. 
// We basically need to compare mat[i][j] with mat[j][i].

import java.io.*; 
  
class Matrix {   
// Returns true if mat[N][N] 
// is symmetric, else false 
    static boolean isSymmetric(int mat[][], int N) { 
        for (int i = 0; i < N; i++) 
            for (int j = 0; j < N; j++) 
                if (mat[i][j] != mat[j][i]) 
                    return false; 
        return true; 
} 
      
    public static void main (String[] args) { 
        int mat[][] = {{ 1, 3, 5 }, 
                       { 3, 2, 4 }, 
                       { 5, 4, 1 }
                      }; 
  
        if (isSymmetric(mat, 3)) 
            System.out.println("Yes");
        else
            System.out.println("NO"); 
          
    } 
} 

