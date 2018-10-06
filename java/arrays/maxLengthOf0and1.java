// Maximum length of segments of 0's and 1's

// Given a string comprising of ones and zeroes. The task is to find the max length of string such that the number of 1
// in each segment is greater than 0
// Note : Each segment taken should be distinct. Index starts from 0.

// Examples: Input - str = "100110001010001"
//           Output - 9
//           i.e 10011, length = 5
//               101, length = 3
//               1, length = 1
//               Hence the answer is 5+3+1 = 9

// Approach:

//     * If start == n, limiting condition arises, return 0.
//     * Run a loop from start till n, computing for each subarray till n.
//     * If character is 1 then increment the count of 1 else increment the count of 0.
//     * If count of 1 is greater than 0, recursively call the function for index (k+1) i.e. next index and add the 
//     remaining length i.e. k-start+1.
//     * Else only recursively call the function for next index k+1.
//     * Return dp[start].

import java.util.*;
import java.lang.Math;

class GFG {
    // Recursive Function to find total length of the array where 1 is greater than 0
    public static int find(int start, String adj, int n, int dp[]){
        // If reaches till end
        if (start == n)
            return 0;

        // If dp is saved
        if (dp[start] != -1)
            return dp[start];

        dp[start] = 0;
        int one = 0, zero = 0, k;

        // Finding for each length
        for (k = start; k < n; k++) { 
            if (adj.charAt(k) == '1') one++;
            else zero++;
            // If the character scanned is 1 if (adj.charAt(k) == '1') one++; else zero++; 
            // If one is greater than zero, add total length scanned till now 
            if (one > zero)
                dp[start] = Math.max(dp[start], find(k + 1, adj, n, dp) + k - start + 1);

            // Continue with next length
            else
                dp[start] = Math.max(dp[start], find(k + 1, adj, n, dp));
        }

        return dp[start];
    }

    public static void main (String[] args){
        String adj = "100110001010001";

        // Size of string
        int n = adj.length();
        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);

        System.out.println(find(0, adj, n, dp));
    }
}