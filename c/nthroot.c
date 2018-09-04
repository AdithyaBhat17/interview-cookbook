#include<stdio.h> 
#include <math.h>
 
double root1(int,int);
 
int main(){
    int n;
    int x;
    double root;
    printf("Enter a number greater than 1: \n");
    scanf("%d",&x);
    if(x>1){
        printf("Enter the value for 'n'(the root to be calculated): \n");
        scanf("%d",&n);
        root = root1(x,n);
        printf("%d st/th/rd Root of %d is %f\n\n", n,x,root);
    }
    else
        printf("try again *_*");
    return 0;
}
 
double root1(int a, int b){
    int j;
    double i,k=1;
    double increment = 0.01; 
    for(i=1; i<=a; i+=increment){
        for(j=0;j<b;j++)
            k *= i;
        if(a < k){
            return(i-increment);
            break;
        }
        else
            k = 1;
    }
}