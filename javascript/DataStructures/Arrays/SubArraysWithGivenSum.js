/*
    Given an unsorted array of non-negative integers, find all the number of subarrays whose sum is a given number K
    Example :
    Input -
        K = 12
        array = [1,2,3,7,5]
    Output - 
        2
*/

const findNumberOfSubArrays = (array,k) => {
    let count = 0
    for(let start=0;start<array.length;start++){
        let sum = 0
        for(let end=start;end<array.length;end++){
            sum += array[end]
            if(sum === k)
                count++
        }
    }
    return count
}

findNumberOfSubArrays([1,2,3,7,5],12)

// Time complexity : O(n^2).
// Space complexity : O(1).
