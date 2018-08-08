/*
 * 1. Selection sort is the simplest sorting algorithm. It finds the smallest element in the array and swaps it with the first position in the array. Then the second smallest and swaps it with the second position etc.
 * 2. Worst Case Time Complexity : O(n2)
 * 3. Best Case Time Complexity : O(n2)
 * 4. Average Time Complexity : O(n2)
 * 5. Space Complexity : O(1)
 * This makes it inefficient to operate on larger datasets
*/

const selectionSort = (array) => {
  if(array.length === 1)
    return array

  for(let i=0;i<array.length;i++){
    //set minimum to current index
    let min = i
    for(let j=i+1;j<array.length;j++){
      if(array[j] < array[min])
        min = j
    }
    [array[i],array[min]] = [array[min],array[i]]
  }
  return array
}

const array = [23,5,87,56,77]
selectionSort(array)
