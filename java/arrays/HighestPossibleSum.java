/*
Asked by - Streamoid Technologies

PROBLEM:
You are given an array of integers and four operators + , * , ( , ) and 
using these four operator you have to find the maximum sum that you can make 
Example: array elements are {1,2,3) Lets examine two scenario 1*2*3 and (1+2)*3 
so second is giving 9 and first is giving 6 so answer should be 9.

*/

//SOLUTION:
/*
for any number other than 1 multiplication gives a higher value than addition.
*/

import java.util.*;

class Sum{    
	public static void main(String args[]){        
		Scanner sc = new Scanner(System.in);        
		int flag = 0;        
		//System.out.println("Enter string length");        
		int n = sc.nextInt();        
		int a[] = new int[n];        
		//System.out.println("Enter integers");        
		for(int i= 0; i < n; i++)          
			a[i]= sc.nextInt();
		
		Arrays.sort(a); // sort the array
		int sum = 0;
		
		if(a[0]!=1)            
			sum=1; 
		
		for(int i =0;i<n;i++){            
			if(a[i] == 1){                
				sum = a[0]+a[1]; //when first element is 1 add it to second smallest element
				i++; //skip iteration for second element
				flag = 1;            
			}            
			else                
				sum = sum*a[i];
            //multiply all other numbers
			//System.out.println(sum);        
		}        
		System.out.println("Sum = "+sum);
        
		if(flag==1){            
			System.out.print("("+a[0]+"+"+a[1]+")");            
			for(int i=2;i<n;i++)                
				System.out.print("*"+a[i]);        
		}        
		else{            
			System.out.print(a[0]);            
			for(int i=1;i<n;i++)                
				System.out.print("*"+a[i]);        
		}     
 	}
}
