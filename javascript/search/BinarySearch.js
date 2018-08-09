/*
    * Binary Search using recursion
    * Time complexity - Olog(n)
    * Memory Complexity - O(logn) - as it will consume memory on the stack
*/
const recBinarySearch = (a,key,low,high) => {
    if(low > high)
        return a
    let mid = low + ((high - low)/2)
    if(a[mid] === key){
        return mid
    }else if(key > a[mid]){
        return recBinarySearch(a,key,mid+1,high)
    }else{
        return recBinarySearch(a,key,low,mid-1)
    }    
}

 /*
    * Binary Search using iteration
    * Time complexity - Olog(n)
    * Memory Complexity - Constant, O(1)
 */

const iteBinarySearch = (a,key,low,high) => {
    while(low <= high){
        let mid = low + ((high-low)/2)
        if(a[mid] === key) return mid
        if(key > a[mid]){
            low = mid + 1
        }else{
            high = mid - 1
        }
    }
    return a
}

const a = [1,11,23,34,45,56,67,78,89,90]
key = 89
console.log(recBinarySearch(a, key,0, a.length-1))
console.log(iteBinarySearch(a, key,0, a.length-1))