// Given a number,find the sum of all its prime divisors

#include<stdio.h>
#include<stdbool.h>

bool isPrime(int n){
    if(n <= 1) return false;
    if(n <= 3) return true;
    if(n % 2 == 0 || n % 3 == 0)
        return false;
    for(int i=5;i*i<=n;i+=6)
        if(n%i == 0 || n%(i+2) == 0)
            return false;
    return true;
}

int sumOfPrimeDivisors(int n){
    int sum = 0;
    for(int i=1;i<=n;i++)
        if(n % i == 0){
            if(isPrime(i))
                sum += i;
        }
    return sum;
}

int main(){
    int n;
    scanf("%d",&n); //enter N
    printf("%d",sumOfPrimeDivisors(n));
    return 0;
}