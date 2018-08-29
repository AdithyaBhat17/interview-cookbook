/*
 Asked by - Delta X

Given two strings,Multiply each letter's positional value (i.e A=1,B=2,..,Z=26) with other letters within the string.
After performing the multiplication,apply mod(47) to the values and return "SAME" if both values else return "NOT SAME".

Example:
 Input : string 1 = ABC
         string 2 = XYZ

Output : NOT SAME
*/

import java.util.Scanner;

class StringMultiplication {
    public static int convertToAscii(String s){
        char[] ch = s.toCharArray();
        int result = 1;
        for(char c : ch){
            int character = (int)c; // returns ascii value of each character.
            int ascii = 64; //for upper case
            if(character >= 65 && character <= 90)
                result *= (character-ascii);
        }
        return result%47;
    }
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		int number1 = convertToAscii(s1.toUpperCase()); 
		int number2 = convertToAscii(s2.toUpperCase());
		System.out.println(number1+","+number2);
		if(number1 == number2)
		    System.out.println("SAME");
		else
		    System.out.println("NOT SAME");
	}
}