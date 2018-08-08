/*
 * Merge sort uses divide & conquer method by splitting the array into smaller parts until there is only one element.
 * The elements are then compared and sorted and merged.
 * Split the arr into half by finding the median.
 * Call mergeSort on the first half and mergeSort on the second half. Then merge the two halves.
 * The time complexity of merge sort is always O(n log n): in all 3 cases (worst, average and best) as merge sort
 * always divides the array in two halves and take linear time to merge two halves.
*/

const mergeSort = array => {
  if(array.length === 1)
    return array

  //split the array into two halves,left and right
  let middle = Math.floor(array.length / 2)
  let left = array.slice(0,middle)
  let right = array.slice(middle)

  //divide and conquer - keep slicing the arrays until we obtain an array with a single item.
  return merge(mergeSort(left),mergeSort(right))
}

const merge = (left,right) => {
  const array = []
  while(left.length && right.length){
    if(left[0] < right[0]){
      array.push(left.shift()) //pushes the first element of the left array (https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/shift)
    } else {
      array.push(right.shift())
    }
  }
  // concatenate arrays to form a single sorted array
  return array.concat(left.slice()).concat(right.slice())
}

const array = [4,232,2,45,66,7,88]
mergeSort(array)
