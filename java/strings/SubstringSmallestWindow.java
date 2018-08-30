/*
Asked by - Streamoid technologies, Amazon, MakeMyTrip

Find the smallest window in a string containing all characters of another string
Given two strings string1 and string2, find the smallest substring in string1 containing 
all characters of string2 efficiently.


For Example:

Input :  string = "this is a test string"
         pattern = "tist"
Output :  Minimum window is "t stri"
Explanation: "t stri" contains all the characters
              of pattern.

Input :  string = "geeksforgeeks"
         pattern = "ork" 
Output :  Minimum window is "ksfor"
*/

// Algorithm: credits(geeksforgeeks)
// 1- First check if length of string is less than
//    the length of given pattern, if yes
//        then "no such window can exist ".
// 2- Store the occurrence of characters of given 
//    pattern in a hash_pat[].
// 3- Start matching the characters of pattern with 
//    the characters of string i.e. increment count 
//    if a character matches
// 4- Check if (count == length of pattern ) this 
//    means a window is found
// 5- If such window found, try to minimize it by 
//    removing extra characters from beginning of
//    current window.
// 6- Update min_length.
// 7- Print the minimum length window.

import java.util.*;

class Strings{
    public static String findSubstring(String string,String pattern){
        int len1 = string.length();
        int len2 = pattern.length();

        if(len1 < len2){ //step 1.
            System.out.println("No such window can exist");
            return "";
        }

        int hash_str[] = new int[256];
        int hash_pat[] = new int[256];

        //step 2.
        for(int i=0;i<len2;i++)
            hash_pat[pattern.charAt(i)]++;

        // traversal of string begins here - step 3
        int count = 0,start = 0,start_index = -1,min_length = Integer.MAX_VALUE;
        for(int j=0;j<len1;j++){
            // count occurrence of characters of string
            hash_str[string.charAt(j)]++;
            // If string's char matches with pattern's char then increment count
            if(hash_pat[string.charAt(j)] != 0 && hash_str[string.charAt(j)] <= hash_pat[string.charAt(j)])
                count++;

            // step 4
            if(count == len2){
                // step 5
                while(hash_str[string.charAt(start)] > hash_pat[string.charAt(start)] || hash_pat[string.charAt(start)] == 0){
                    if(hash_str[string.charAt(start)] > hash_pat[string.charAt(start)] || hash_pat[string.charAt(start)] == 0)
                        hash_str[string.charAt(start)]--;
                    start++;
                }
                //step 6.
                int length_window = j - start + 1;
                if(min_length > length_window){
                    min_length = length_window;
                    start_index = start;
                }
            }
        }
        if(start_index == -1){
            System.out.println("No such window exists");
            return "";
        }
        // step 7
        return string.substring(start_index,start_index + min_length);
    }
    public static void main(String args[]){
        String str = "this is a test string";
        String pat = "tist";      
        System.out.print("Smallest window is : " + findSubstring(str, pat));
    }
}