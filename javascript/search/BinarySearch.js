/*
    * Binary Search using recursion
    * Time complexity - Olog(n)
    * Memory Complexity - O(logn) - as it will consume memory on the stack
*/
let steps = 0

const binarySearch = (array,key) => {
    const mid = Math.floor(array.length / 2)

    steps++

    if(array.length === 1){
        if(array[0] === key){
            return true
        }else{
            return false
        }
    }

    if(array[mid] > key){
        const left = array.slice(0,mid+1)
        return binarySearch(left,key)
    } else if(array[mid] < key){
        const right = array.slice(mid,array.length)
        return binarySearch(right,key)
    } else {
        console.log(`No. of steps to find ${key} in the given array is ${steps}`)
        return true
    }
}

const array = [1,2,3,4,5,6,7,8,9,10]
console.log(binarySearch(array,9)) 
//output : No of steps to find 9 in the given array is 3
//true