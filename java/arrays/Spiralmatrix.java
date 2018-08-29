// Asked by - Delta X
// Given m x n matrix,print the elements by traversing through the array in spiral form(clockwise)

// Example - 
//  m=4,n=4
//  array = [1,2,3,4
//          5,6,7,8
//          9,10,11,12
//          13,14,15,16]

// Output - 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10

import java.util.Scanner;
class Spiral{
    public static void  printMatrix(int m,int n,int array[][]){
        int k=0,l=0,i; //k and l are starting row and column index respectively.
        while(k < m && l < n){
            // traverse the first row.
            for(i=l;i<n;++i){
                System.out.print(array[k][i] + " ");
            }
            k++;
    
            //traverse the last column.
            for(i=k;i<m;++i)
                System.out.print(array[i][n-1] + " ");
            n--;

            //traverse the last row.
            if(k < m){
                for(i=n-1;i>=l;--i)
                    System.out.print(array[m-1][i] + " ");
                m--;
            }
            //traverse the first column.
            if(l < n){
                for(i=m-1;i>=k;--i)
                    System.out.print(array[i][l] + " ");
                l++;
            }
        }
    }
    public static void main(String args[]){
        int m,n; //total no. of rows and columns.
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        int array[][] = new int[m][n]; 
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                array[i][j] = sc.nextInt();
        printMatrix(m,n,array);
    } 
}