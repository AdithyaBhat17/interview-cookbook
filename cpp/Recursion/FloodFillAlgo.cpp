// Asked by Google

// Given a 2D screen, location of a pixel in the screen and a color, replace color of the given pixel and all 
// adjacent same colored pixels with the given color.

// Example:

// Input:
//        screen[M][N] = {{1, 1, 1, 1, 1, 1, 1, 1},
//                       {1, 1, 1, 1, 1, 1, 0, 0},
//                       {1, 0, 0, 1, 1, 0, 1, 1},
//                       {1, 2, 2, 2, 2, 0, 1, 0},
//                       {1, 1, 1, 2, 2, 0, 1, 0},
//                       {1, 1, 1, 2, 2, 2, 2, 0},
//                       {1, 1, 1, 1, 1, 2, 1, 1},
//                       {1, 1, 1, 1, 1, 2, 2, 1},
//                       };
//     x = 4, y = 4, newColor = 3

// The values in the given 2D screen indicate colors of the pixels.
// x and y are coordinates of the brush, newColor is the color that
// should replace the previous color on screen[x][y] and all surrounding
// pixels with same color.

// Output:
// Screen should be changed to following.
//        screen[M][N] = {{1, 1, 1, 1, 1, 1, 1, 1},
//                       {1, 1, 1, 1, 1, 1, 0, 0},
//                       {1, 0, 0, 1, 1, 0, 1, 1},
//                       {1, 3, 3, 3, 3, 0, 1, 0},
//                       {1, 1, 1, 3, 3, 0, 1, 0},
//                       {1, 1, 1, 3, 3, 3, 3, 0},
//                       {1, 1, 1, 1, 1, 3, 1, 1},
//                       {1, 1, 1, 1, 1, 3, 3, 1},
//                       };

// The idea is simple, we first replace the color of current pixel, then recur for 4 surrounding points. The following is detailed algorithm.

// // A recursive function to replace previous color 'prevC' at  '(x, y)' 
// // and all surrounding pixels of (x, y) with new color 'newC' and
// floodFil(screen[M][N], x, y, prevC, newC)
// 1) If x or y is outside the screen, then return.
// 2) If color of screen[x][y] is not same as prevC, then return
// 3) Recur for north, south, east and west.
//     floodFillUtil(screen, x+1, y, prevC, newC);
//     floodFillUtil(screen, x-1, y, prevC, newC);
//     floodFillUtil(screen, x, y+1, prevC, newC);
//     floodFillUtil(screen, x, y-1, prevC, newC); 

#include<iostream> 
using namespace std; 


// A C++ program to implement flood fill algorithm 
#include<iostream> 
using namespace std; 
  
// Dimentions of paint screen 
#define M 8 
#define N 8 

void floodFillUtil(int screen[][N], int x, int y, int prevC, int newC) { 
    // step 1 and 2
    if (x < 0 || x >= M || y < 0 || y >= N) 
        return; 
    if (screen[x][y] != prevC) 
        return; 
  
    // Replace the color at (x, y) 
    screen[x][y] = newC;   
    // Recur for north, east, south and west 
    floodFillUtil(screen, x+1, y, prevC, newC); 
    floodFillUtil(screen, x-1, y, prevC, newC); 
    floodFillUtil(screen, x, y+1, prevC, newC); 
    floodFillUtil(screen, x, y-1, prevC, newC); 
} 

// Function to find the previous color on (x, y) and call floodFillUtil() 
void floodFill(int screen[][N], int x, int y, int newC) { 
    int prevC = screen[x][y]; 
    floodFillUtil(screen, x, y, prevC, newC); 
} 

int main() { 
    int screen[M][N] = {{1, 1, 1, 1, 1, 1, 1, 1}, 
                      {1, 1, 1, 1, 1, 1, 0, 0}, 
                      {1, 0, 0, 1, 1, 0, 1, 1}, 
                      {1, 2, 2, 2, 2, 0, 1, 0}, 
                      {1, 1, 1, 2, 2, 0, 1, 0}, 
                      {1, 1, 1, 2, 2, 2, 2, 0}, 
                      {1, 1, 1, 1, 1, 2, 1, 1}, 
                      {1, 1, 1, 1, 1, 2, 2, 1}, 
                     }; 
    int x = 4, y = 4, newC = 3; 
    floodFill(screen, x, y, newC); 
  
    cout << "Updated screen after call to floodFill: n" << endl; 
    for (int i=0; i<M; i++) { 
        for (int j=0; j<N; j++) 
           cout << screen[i][j] << " "; 
        cout << endl; 
    } 
} 