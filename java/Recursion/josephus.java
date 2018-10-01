// Asked by Walmart

// Given the total number of persons n and a number k which indicates that k-1 persons are skipped and kth person is 
// killed in circle in a fixed direction. The task is to choose the safe place in the circle so that when you 
// perform these operations starting from 1st place in the circle, you are the last one remaining and survive. 
// You are required to complete the function josephus which returns an integer denoting such position .

// The problem has following recursive structure.

//   josephus(n, k) = (josephus(n - 1, k) + k-1) % n + 1
//   josephus(1, k) = 1
// After the first person (kth from begining) is killed, n-1 persons are left. So we call josephus(n - 1, k) to 
// get the position with n-1 persons. But the position returned by josephus(n - 1, k) will consider the position 
// starting from k%n + 1. So, we must make adjustments to the position returned by josephus(n - 1, k).

import java.io.*;

class Josefus{
    static int josephus(int n, int k) { 
    if (n == 1) 
        return 1; 
    else
        /* The position returned by josephus(n - 1, k) is adjusted because the recursive call josephus(n - 1, k) 
        considers the original position k%n + 1 as position 1 */
        return (josephus(n - 1, k) + k-1) % n + 1; 
    }     
    public static void main(String[] args) { 
    int n = 14; 
    int k = 2; 
    System.out.println("The chosen place is " + josephus(n, k)); 
    } 
} 
