/*
Commonly asked by - PayTM, Amazon, MakeMyTrip, OneDirect.

Given a list of non negative integers, arrange them in such a manner that they form the largest number possible.

The result is going to be very large, hence return the result in the form of a string.

Example : 
    Input - array = [3, 30, 34, 5, 9]
    Output - `9534330` (returned as a string).
*/

const largestNumber = (array) => {
    let number =[]
    let result = ''
    for(let i=0;i<array.length;i++)
        number.push(array[i] + '')    
    number.sort((a,b) => {
        let leftToRight = a + b
        let rightToLeft = b + a
        if(leftToRight > rightToLeft)
            return -1
        if(leftToRight < rightToLeft)
            return 1
        return 0
    })
    for(let i=0;i<number.length;i++)
        result += number[i]
    return result 
}

const array = [3,30,34,5,9]
largestNumber(array)
