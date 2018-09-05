// check if a given number is a Fibonacci number

// Note : A number n is said to be a Fibonacci number if (5(n)^2 + 4) or (5(n)^2 - 4) is a perfect square.

#include<stdio.h>
#include<math.h>
#include<stdbool.h> // importing boolean 

bool isPerfectSquare(int x){
    int s = sqrt(x);
    if(s*s == x)
        return true;
    return false; 
}

bool isFibonacci(int n){
    if(isPerfectSquare(5*n*n + 4) || isPerfectSquare(5*n*n - 4) == true)
        return true;
    return false;
}

void main(){
    int number;
    scanf("%d",&number);
    if(isFibonacci(number) == true)
        printf("the number %d is a Fibonacci number",number);
    else
        printf("the number %d is not a Fibonacci number",number);
}
