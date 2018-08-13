// PayTM,Amazon,Morgan Stanley.

/*
Given an array of 0's and 1's your task is to complete the function maxLen which returns  size of  the  largest sub array with equal number of 0's and 1's .
The function maxLen takes 2 arguments .The first argument is the array A[] and second argument is the size 'N' of the array A[] .

Input:
The first line of the input is T denoting the number of test cases .
Then T test cases follow . Each test case contains two lines . 
The first line of each test case is a number N denoting the size of the array and in the next line are N space separated values of A [ ].

Output:
For each test case output in a new line the max length of the subarray .

Constraints:
1<=T<=100
1<=N<=100
0<=A[ ] <=1

Example:
Input (To be used only for expected output) :
2
4
0 1 0 1
5
0 0 1 0 0 

Output
4
2
*/

const maxLen = (array,n) => {
    let maxSize = -1
    let start = 0
    for(let i=0;i<n-1;++i){
        let sum = 0
        if(array[i] === 0){ //consider all zeroes as -1.
            sum = -1
        } else {
            sum = 1
        } 
        for(let j=i+1;j<n;++j){
            if(array[j] === 0){ //sum of sub-array
                sum--
            }else{
                sum++
            }
            if(sum === 0 && (j-i+1) > maxSize){
                maxSize = j-i+1
                start = i
            }
        }
    }
    return `start index is ${start} and ends at ${maxSize+start-1}.The size is ${maxSize}`
}

maxLen([1,1,0,1,0],5)

