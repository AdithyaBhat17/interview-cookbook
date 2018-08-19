'''
Given a postfix expression, the task is to evaluate the expression and print the final value.Operators will only include the basic arithmetic operators like *,/,+ and - . 

Input:
The first line of input will contains an integer T denoting the no of test cases . Then T test cases follow. Each test case contains an postfix expression.

Output:
For each test case, evaluate the postfix expression and print the value.

Constraints:
1 <= T <= 100
1 <= length of expression <= 100

Example:

Input:
2
231*+9-
123+*8-

Output:
-4
-3
'''





# Python program to evaluate value of a postfix expression
 
# Class to convert the expression
class Evaluate:
     
    # Constructor to initialize the class variables
    def __init__(self, capacity):
        self.top = -1
        self.capacity = capacity
        # This array is used a stack 
        self.array = []
     
    # check if the stack is empty
    def isEmpty(self):
        return True if self.top == -1 else False
     
    # Return the value of the top of the stack
    def peek(self):
        return self.array[-1]
     
    # Pop the element from the stack
    def pop(self):
        if not self.isEmpty():
            self.top -= 1
            return self.array.pop()
        else:
            return "$"
     
    # Push the element to the stack
    def push(self, op):
        self.top += 1
        self.array.append(op) 
 
 
    # The main function that converts given infix expression
    # to postfix expression
    def evaluatePostfix(self, exp):
         
        # Iterate over the expression for conversion
        for i in exp:
             
            # If the scanned character is an operand
            # (number here) push it to the stack
            if i.isdigit():
                self.push(i)
 
            # If the scanned character is an operator,
            # pop two elements from stack and apply it.
            else:
                val1 = self.pop()
                val2 = self.pop()
                self.push(str(eval(val2 + i + val1)))
 
        return self.pop()
                 
n = int(input())
for i in range(0,n):
    expr = input()
    obj = Evaluate(len(expr))
    x = int(float(obj.evaluatePostfix(expr)))    #int(0.0) gives an error, hence int(float(0.0))
    print(x)