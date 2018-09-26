// Find maximum among x^(y^2) or y^(x^2) where x and y are given
// Given X and Y whose values are greater than 2, the task is to find out which is maximum among
// x^(y^2) and y^(x^2)

// Examples:

// Input: X = 4, Y = 9
// Output: 1

// Input: X = 4, Y = 3
// Output: 2

// HINT : If x > y, then F(x) < F(y)

import java.io.*;   
class GFG {   
// Function to find maximum 
static boolean findGreater(int x, int y) { 
    // Case 1 
    if (x > y)  
        return false; 
      
    // Case 2 
    else  
        return true; 
} 
  
// Driver Code 
public static void main (String[] args){ 
    int x = 4; 
    int y = 9;       
    if(findGreater(x, y)) 
        System.out.println("1"); 
    else
        System.out.println("2"); 
} 
} 