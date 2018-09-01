/*
 Asked by - Delta X

 2 players play a game. A number is given as input. If the number is a power of 2(i.e, 2^1, 2^2 .. 2^64),
 then divide the number by 2 and pass the number to the other player. Else, if the number is not a power
 of 2, then subtract the number with its nearest 2 power number and pass the number to the other player.
 PlayerA always starts the game. The player who gets to value 1(one) is the winner. Output the name of
 the winner, i.e, 'PlayerA' or 'PlayerB'
   
    Ex: 
    n = 10
    Output: PlayerB
   
    n = 12
    Output = PlayerA
*/

import java.util.Scanner;
import java.lang.Math;

class PowerGame{
    public static int isPower(int number){
        int value = 1;
        for(int i=1;i<65;i++){
            value *= 2;
            if(number == value)
                return -1; // return -1 is it is a power of 2.
            else if(value > number)
                return i-1; //return the nearest power.
        }
        return 0;
    }
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in); 
       int n = sc.nextInt(); //enter the input number.
       int turn = 1; // keeps track of the player in current possession of the number.(A-1,B-2)
       int count = 0;

       while(n != 1){
            count++;
            if(count % 2 == 0)
                turn = 2; //B's turn
            else 
                turn = 1; //A's turn
            
            int value = isPower(n);
            if(value == -1)
                n = n/2;
            else
                n = n - (int)Math.pow(2, value);
       }
        if(turn == 1)
            System.out.println("Player A wins");
        else
            System.out.println("Player B wins");
    }
}