// Find difference between sums of two diagonals
// Given a matrix of n X n. The task is to calculate the absolute difference between the sums of its diagonal.

// Examples:

// Input : mat[][] = 11 2 4
//                    4 5 6
//                   10 8 -12 
// Output : 15
// Sum of primary diagonal = 11 + 5 + (-12) = 4.
// Sum of primary diagonal = 4 + 5 + 10 = 19.
// Difference = |19 - 4| = 15.


// Input : mat[][] = 10 2
//                    4 5
// Output : 7

// Calculate the sums across the two diagonals of a square matrix. 
// Along the first diagonal of the matrix, row index = column index i.e mat[i][j] lies on the first diagonal if i = j. 
// Along the other diagonal, row index = n - 1 - column index i.e mat[i][j] lies on the second diagonal if i = n-1-j. 
// By using two loops we traverse the entire matrix and calculate the sum across the diagonals of the matrix.
// Time complexity : O(n*n)

// We can optimize above solution to work in O(n) using the patterns present in indexes of cells.
  
class Matrix {       
    public static int difference(int arr[][], int n) { 
        // Initialize sums of diagonals 
        int d1 = 0, d2 = 0;        
        for (int i = 0;i < n;i++) { 
            d1 += arr[i][i]; 
            d2 += arr[i][n-i-1]; 
        }        
        // Absolute difference of the sums 
        // across the diagonals 
        return Math.abs(d1 - d2); 
    } 
      
    public static void main(String[] args){ 
        int n = 3;            
        int arr[][] = { 
            {11, 2, 4}, 
            {4 , 5, 6}, 
            {10, 8, -12} 
        };        
        System.out.print(difference(arr, n));          
    } 
} 