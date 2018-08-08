/*
 * Given an integer array, sort it in ascending order using quicksort.
 *
 * Runtime Complexity - Linearithmic, O(nlogn).
 * Memory Complexity - Logarithmic, O(logn).
 * Note: Recursive solution has O(logn) memory complexity as it will consume memory on the stack.
 *
 *
 * Step 1: Select a pivot element from the array, usually the first element
 * Step 2: Compare the pivot element with the current element. If the current element is less than the pivot,
 *         shift the current element to the left side and if it is greater than the pivot, shift it to the right
 *         side of the pivot.
 * Step 3: Recursively sort the sublists on the right and left sides of the pivot
*/

const quickSort = (array,left,right) => {
  left = left || 0
  right = right || array.length - 1

  const pivot = partition(array,left,right)

  if(left < pivot - 1)
    quickSort(array,left,pivot - 1)
  if(right > pivot)
    quickSort(array,pivot,right)

  return array
}

const partition = (array,left,right) => {
  //find the pivot element - middle element would be an ideal pivot
  const pivot = Math.floor((left + right) / 2)
  //refer Step 2
  while(left <= right){
    while(array[left] < array[pivot])
      left++
    while (array[right] > array[pivot])
      right--

    if(left <= right){
      //swap the elements
      [array[left],array[right]] = [array[right],array[left]]
      left++
      right--
    }
  }
  //return the left index as the pivot value.
  return left
}

const array = [24,23,535,5,44,21]
quickSort(array)
