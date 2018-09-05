// Write a program to find the shortest distance between a point and a plane in 3-D

// Note : Equation of a plane => ax + by + cz + d = 0
// point => (x1,y1,z1)
// Distance = (|ax1 + by1 + cz1 + d|)/sqrt(a^2 + b^2 + c^2)

#include<stdio.h>
#include<math.h>
#include<stdlib.h> // for abs.

void shortestPath(int x1, int y1, int z1, int a, int b, int c, int d){
    d = abs(a*x1 + b*y1 + c*z1 + d);
    int e = sqrt(a*a + b*b + c*c);
    printf("shortest path is %f",d/e);
}

void main(){
    int x1,y1,z1,a,b,c,d;
    scanf("%d%d%d",&x1,&y1,&z1); //point.
    scanf("%d%d%d%d",&a,&b,&c,&d); //co-efficients of the plane.
    shortestPath(x1,y1,z1,a,b,c,d);
}