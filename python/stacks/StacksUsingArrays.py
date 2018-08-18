'''
Implement a Stack using Array .

Input (To be used for Expected Output):

The first line of the input contains an integer 'T' denoting the number of test cases. Then T test cases follow.
First line of each test case contains an integer Q denoting the number of queries . 
A Query Q is of 2 Types
(i) 1 x   (a query of this type means  pushing 'x' into the stack)
(ii) 2     (a query of this type means to pop element from stack and print the poped element)

The second line of each test case contains Q queries seperated by space.

Output:
The output for each test case will  be space separated integers having -1 if the stack is empty else the element poped out from the stack . 
You are required to complete the two methods push which take one argument an integer 'x' to be pushed into the stack  and pop which returns a integer poped out from the stack.

Constraints:
1<=T<=100
1<=Q<=100
1<=x<=100

Example:
Input
1
5
1 2 1 3 2 1 4 2   

Output
3 4
'''

# Python program for implementation of stack
 
# import maxsize from sys module 
# Used to return -infinite when stack is empty
from sys import maxsize
 
# Function to create a stack. It initializes size of stack as 0
def createStack():
    stack = []
    return stack
 
# Stack is empty when stack size is 0
def isEmpty(stack):
    return len(stack) == 0
 
# Function to add an item to stack. It increases size by 1
def push(stack, item):
    stack.append(item)
    #print("pushed to stack " + item)
     
# Function to remove an item from stack. It decreases size by 1
def pop(stack):
    if (isEmpty(stack)):
        return str(-maxsize -1) #return minus infinite
     
    return stack.pop()
st = createStack()    
t = int(input())
for t in range(0,t):
    n = int(input())
    inp = input()
    arr=inp.split()
    #print(arr)
    #print(n)
    i=0
    while n>0:
        if arr[i]=='1':
            i=i+1
            push(st,arr[i])
            i=i+1
        elif arr[i]=='2':
            print(pop(st),end=' ')
            i=i+1
        n-=1
        
    #print(st)