'''
An string of words is given, the task is to reverse the string using stack.

Input:

The first line of input will contains an integer T denoting the no of test cases . Then T test cases follow. Each test case contains a string s of words without spaces.

Output:

For each test case ,print the reverse of the string in new line. 

Constraints:

1<=T<=100
1<=length of the string <=100

Example:

Input:

2
Python
StackImplementation

Output:

nohtyP
noitatnemelpmIkcatS
'''

# Python program to reverse a string using stack
 
# Function to create an empty stack. It initializes size of stack as 0
def createStack():
    stack=[]
    return stack
 
# Function to determine the size of the stack
def size(stack):
    return len(stack)
 
# Stack is empty if the size is 0
def isEmpty(stack):
    if size(stack) == 0:
        return true
 
# Function to add an item to stack . It increases size by 1    
def push(stack,item):
    stack.append(item)
 
#Function to remove an item from stack. It decreases size by 1
def pop(stack):
    if isEmpty(stack): return
    return stack.pop()
 
# A stack based function to reverse a string
def reverse(string):
    n = len(string)
     
    # Create a empty stack
    stack = createStack()
 
    # Push all characters of string to stack
    for i in range(0,n,1):
        push(stack,string[i])
 
    # Making the string empty since all characters are saved in stack    
    string=""
 
    # Pop all characters of string and put them back to string
    for i in range(0,n,1):
        string+=pop(stack)
         
    return string
    
n = int(input())
for i in range(0,n):
    str1 = input()
    str2 = reverse(str1)
    print(str2)