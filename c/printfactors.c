// Print factors of a given number N in pairs

#include<stdio.h>

void printFactors(int N){
    for(int i=1;i*i<=N;i++)
        if(N % i == 0)
            printf("%d * %d\n",i,(N/i));
}

int main(){
    int number = 24;
    printFactors(number);
    return 0;
}