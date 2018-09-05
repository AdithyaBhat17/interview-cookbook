// Find the sum of series whose 'i'th term is i^k - (i-1)^k

#include<stdio.h>
#define MOD 1000000007

int sumOfseries(int n, int k){
    long result = 1;
    for(int i=0;i<k;i++)
        result = (result * n) % MOD;
    return result; 
}
int main(){
    int n = 4,k = 3;
    printf("sum = %d",sumOfseries(n,k));
    return 0;
}