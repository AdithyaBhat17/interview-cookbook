/*
Asked By - Zycus, Oracle.
Given an array of integers, sort the array according to frequency of elements.
For example, if the input array is {2, 3, 2, 4, 5, 12, 2, 3, 3, 3, 12},
then modify the array to {3, 3, 3, 3, 2, 2, 2, 12, 12, 4, 5}. 

If frequencies of two elements are same, print them in increasing order.
*/

const sortByFrequency = (array) => {
    let frequency = []
    let Sort = []
    let result = []
    array.forEach((value) => {
        if(value in frequency)
            frequency[value]++
        else    
            frequency[value] = 1
    })
    for(let key in frequency)
        Sort.push([key, frequency[key]])
    Sort.sort((a,b) => b[1] - a[1])
    Sort.forEach((obj) => {
        for(let i=0;i<obj[1];i++)
            result.push(obj[0])
    })
    return result
}

const array = [5,5,4,6,4]
sortByFrequency(array)

// Output - [4,4,5,5,6]