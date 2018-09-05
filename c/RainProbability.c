// Find the probability of rain on (n+1)th day given an array which shows the data for rain of the previous n days.

#include<stdio.h>

float rainProbability(int a[],int n){
    float count = 0, m;
    for(int i=0;i<n;i++)
        if(a[i] == 1)
            count++;
    m = count/n;
    return m;
}

int main(){
    int a[] = {1,0,1,0,1,1,1,1};
    int n = sizeof(a)/sizeof(a[0]);
    printf("%f",rainProbability(a,n));
    return 0;
}
