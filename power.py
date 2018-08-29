import math

def check(n):
    val = 1
    for i in range(1, 65):
        val = val * 2
        if(n == val):
            return -1
        elif(val > n):
            return i-1

n = int(input("Enter n"))

turn = 1
count = 0

while(n != 1):
    count = count + 1
    if(count % 2 == 0):
        turn = 2
    else:
        turn = 1
        
    val = check(n)
    
    if (val == -1):
        n = n / 2
    else:
        n = n - math.pow(2, val)
        
if (turn == 1):
    print("PlayerA")
else:
    print("PlayerB")
