/*
 * 1. Bubble sort is the simplest sorting algorithm that compares two adjacent elements in an array and swaps the largest of the two values to  the end.
 * 2. The worst case time complexity of bubble sort is O(n2): this is because for each iteration n-1 comparisons will be done.
 * 3. The best case  time complexity will be O(n): this is when the list is already sorted
 * 4. The space time complexity will be O(1): since only one memory space is required for the temp variable.
*/
const bubbleSort = (array) => {
  let swap
  do{
    swap = false
    for(let i=0;i<array.length;i++){
      // Check if there's a number next to the current number and whether it's lesser than the current number,if yes then swap the numbers
      if(array[i] && array[i+1] && array[i] > array[i+1]){
        [array[i],array[i+1]] = [array[i+1],array[i]]
        swap = true
      }
    }
  }while(swap)
  return array
}

const array = [25,23,3,56,14]
bubbleSort(array)
