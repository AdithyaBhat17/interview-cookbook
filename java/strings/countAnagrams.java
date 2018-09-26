// Given a word and a text, return the count of occurences of anagrams of the word in the text(For eg: anagrams of word for are for, ofr, rof etc.)
// For example : 
//     Input: forxxorfxdofr
//         for
//     Output: 3

import java.util.*;
import java.io.*;

class Anagrams{
    final static int MAX = 256;
    // to check if two strings are equal.
    static boolean isAnagram(String s1, String s2){
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if(Arrays.equals(c1, c2))
            return true;
        return false;
    }

    static int countAnagrams(String text, String word){
        int N = text.length();
        int n = word.length();        
        int res = 0;
        for(int i=0;i<=N-n;i++){
            String s = text.substring(i, i+n);
            if(isAnagram(word, s))
                res++;
        }
        return res;
    }

    public static void main(String args[]){
        String text = "forxxorfxdofr";
        String word = "for";
        System.out.println(countAnagrams(text, word));
    }
}