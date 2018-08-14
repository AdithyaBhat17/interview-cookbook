/*
 Given an array of size n-1 and given that there are numbers from 1 to n with one missing, the missing number is to be found.

 Example:

 Input
 
 1 2 3 5

 Output
 4
*/

const findMissingNumbers = (array) => {
    let missingNumbers = []
    array.sort() //sort the array to make sure the elements are in the increasing order
    for(let i=1;i<array.length;i++){
        if(array[i] - array[i-1] !== 1){ /* any number missing from the array can be found here since in a sequence,
            current - previous element =1 */
            for(let j=1;j<(array[i] - array[i-1]);j++)
                missingNumbers.push(array[i-1] + j)
        }
    }
    return missingNumbers
}

const array = [1,2,3,6]
findMissingNumbers(array)