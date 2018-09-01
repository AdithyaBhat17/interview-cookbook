/*
Asked by - Streamoid Technologies

PROBLEM:
You are given a integer n .Find how many ways you can make a palindrome number consisting of n digits and 
print it, also you are not supposed to use any array or character array which means you can only use recursion.

Example : n = 2 then answer would be 11,22,33,....
*/

import java.util.*;

public class myMain {
    public static long mirror(long num1, long num2) {
        if(num2 < 10) return num1*10 + num2;      //for the last digit       
        return(mirror(num1*10 + num2 % 10, num2/10));   //reverses the given number in each iteration
    }
    public static long printPalindrome(int num) {
        long total = 0L;
        if(num%2 == 0) {     //for number with even digits  
            int base = num/2;
            Long startInt = Math.round(Math.pow(10, base-1));    //calculates starting and ending numbers for first half
            Long endInt = Math.round(Math.pow(10, base)) - 1;
            //System.out.println("start:" + startInt + ",end:" + endInt);
            for(long l1 = startInt; l1 <= endInt; l1++) {
                long l2 = mirror(0L,l1);
                System.out.println(l1 * startInt * 10 +  l2);   //concatinate first half and mirrored half    
                total++;
            }
        } else {     //for number with odd digits 
            int base = num/2;                                                    
            Long startInt = Math.round(Math.pow(10, base-1)); //calculates starting and ending numbers for first half
            Long endInt = Math.round(Math.pow(10, base)) - 1;
            System.out.println("start:" + startInt + ",end:" + endInt);
            for(long l1 = startInt; l1 <= endInt; l1++) {
                long l2 = mirror(0L,l1);
                for(int mid = 0; mid < 10 ; mid++) {
                      System.out.println((l1 * 10 + mid)*startInt*10 + l2); //concatinate first half, middle digit and mirrored half
                      total++;
                }
            }
        }
        return total;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num < 2) {
            System.out.println("Please specify at least 2");
            System.exit(1);
        }
        //printPallindrome(num);
        long total = printPalindrome(num);
        System.out.println("Total Palindromes:" + total);

    }
}