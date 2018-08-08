/*
 * Insertion sort compares the current element with the element on the left.
 * If it is found to be smaller it is swapped with the element on the left.
 * Worst Case Time Complexity : O(n2)
 * Best Case Time Complexity : O(n)
 * Average Time Complexity : O(n2)
 * Space Complexity : O(1)
 * This makes it inefficient to operate on larger datasets
*/

const insertionSort = (array) => {
  if(array.length == 1)
    return array;
  for(let i=1;i<array.length;i++){
    for(let j=i;j>0;j--){
      if(array[j] < array[j-1]){
        [array[j],array[j-1]] = [array[j-1],array[j]]
      }
    }
  }
  return array
}

const array = [25,23,3,26,4]
insertionSort(array)
