#    Asked by - Delta X

#    2 players play a game. A number is given as input. If the number is a power of 2(i.e, 2^1, 2^2 .. 2^64),
#    then divide the number by 2 and pass the number to the other player. Else, if the number is not a power
#    of 2, then subtract the number with its nearest 2 power number and pass the number to the other player.
#    PlayerA always starts the game. The player who gets to value 1(one) is the winner. Output the name of
#    the winner, i.e, 'PlayerA' or 'PlayerB'
   
#    Ex: 
#    n = 10
#    Output: PlayerB
   
#    n = 12
#    Output = PlayerA

import math

#Function to check if a number is a power of 2. 
def check(n):
    val = 1
    for i in range(1, 65):
        val = val * 2
        if(n == val):
            return -1 #return -1 if it is a power of 2
        elif(val > n):
            return i-1 #return the nearest power value

n = int(input("Enter n"))

turn = 1 #to keep track of which player is playing
count = 0 

while(n != 1):
    count = count + 1
    if(count % 2 == 0):
        turn = 2 #playerB turn
    else:
        turn = 1 #playerA turn
        
    val = check(n) #check if number is a power of 2
    
    if (val == -1):
        n = n / 2
    else:
        n = n - math.pow(2, val)
        
if (turn == 1):
    print("PlayerA")
else:
    print("PlayerB")
