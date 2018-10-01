// Asked by Amazon

// There is a stack of water glasses in a form of pascal triangle and a person wants to pour the water at 
// the topmost glass, but the capacity of each glass is 1 unit . Overflow takes place in such a way that after 
// 1 unit, 1/2 of remaining unit gets into bottom left glass and other half in bottom right glass.

// Now the pours K units of water in the topmost glass and wants to know how much water is there in the jth glass 
// of the ith row.

// Assume that there are enough glasses in the triangle till no glass overflows.

// There are some glasses with equal capacity as 1 litre. The glasses are kept as follows:
//                    1
//                  2   3
//               4    5    6
//             7    8    9   10
// You can put water to only top glass. If you put more than 1 litre water to 1st glass, water overflows and fills 
// equally in both 2nd and 3rd glasses. Glass 5 will get water from both 2nd glass and 3rd glass and so on.
// If you have X litre of water and you put that water in top glass, how much water will be contained by jth glass
// in ith row?

// Example. If you will put 2 litre on top.
// 1st - 1 litre
// 2nd - 1/2 litre
// 3rd - 1/2 litre

import java.lang.*; 

class Water{ 
    // Returns the amount of water in jth glass of ith row 
    static float findWater(int i, int j, float X){ 
    // A row number i has maximum i columns. So input column number must be less than i 
        if (j > i) { 
            System.out.println("Incorrect Input"); 
            System.exit(0); 
        } 
    
        // There will be i*(i+1)/2 glasses till ith row (including ith row) 
        int ll = Math.round((i * (i + 1) )); 
        float[] glass = new float[ll + 2]; 
        
        // Put all water in first glass 
        int index = 0; 
        glass[index] = X; 
    
        // Now let the water flow to the downward glasses till the row number is less than or/ equal  
        // to i (given row) correction : X can be zero for side glasses as they have lower rate to fill 
        for (int row = 1; row <= i ; ++row) { 
            // Fill glasses in a given row. Number of columns in a row is equal to row number 
            for (int col = 1;col <= row; ++col, ++index) { 
                // Get the water from current glass 
                X = glass[index];     
                // Keep the amount less than or equal to capacity in current glass 
                glass[index] = (X >= 1.0f) ? 1.0f : X; 
        
                // Get the remaining amount 
                X = (X >= 1.0f) ? (X - 1) : 0.0f; 
        
                // Distribute the remaining amount to the down two glasses 
                glass[index + row] += X / 2; 
                glass[index + row + 1] += X / 2; 
            } 
        }   
        // The index of jth glass in ith row will be i*(i-1)/2 + j - 1 
        return glass[(int)(i * (i - 1) / 2 + j - 1)]; 
    } 
  
    public static void main(String[] args) { 
        int i = 2, j = 2; 
        float X = 2.0f; // Total amount of water 
        System.out.println("Amount of water in jth " + "glass of ith row is: " + findWater(i, j, X)); 
    } 
} 