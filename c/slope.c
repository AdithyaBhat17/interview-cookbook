// Given a number n,find the slope of the given number.

// Note : slope of a number is the number of minima and maxima digits.
// A digit is called a minima if the digit is lesser than the digit before and after it.
// Similarly a digit is called a maxima if the digit is greater than the digit before and after it.

#include<stdio.h>
#include<string.h>

int slopeOfNumber(char* number ,int n){
    int slope = 0;
    // loop from the second digit till the last second digit.
    for(int i=1;i<n-1;i++)
        if(number[i] > number[i-1] && number[i] > number[i+1]) //finding the maxima
            slope++;  
        else if(number[i] < number[i-1] && number[i] < number[i+1]) //finding minima
            slope++;
    return slope;
}

// Driver code
int main(){
    char* number = "1213321";
    int n = strlen(number);
    printf("slope of %s is %d",number,slopeOfNumber(number , n));
    return 0;
}

// slope of 1213321 is 2
// slope of 273299302236131 is 6

