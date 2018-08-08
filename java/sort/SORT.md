# Sort  
## Bubble Sort  
Bubble Sort is a
simple sorting algorithm that repeatedly steps through
the list to be sorted, compares each pair of adjacent
items and swaps them if they are in the wrong order.
The pass through the list is repeated until no swaps
are needed, which indicates that the list is sorted.

![Algorithm Visualization](https://upload.wikimedia.org/wikipedia/commons/c/c8/Bubble-sort-example-300px.gif)


## Insertion Sort

Insertion sort compares the current element with the element on the left.If it is found to be smaller it is swapped with the element on the left.

![Algorithm Visualization](https://upload.wikimedia.org/wikipedia/commons/0/0f/Insertion-sort-example-300px.gif)

## Merge Sort

Merge Sort is a Divide and Conquer algorithm. It divides input array in two halves, calls itself for the two halves and then merges the two sorted halves.

![Merge Sort](https://upload.wikimedia.org/wikipedia/commons/c/cc/Merge-sort-example-300px.gif)

A recursive merge sort algorithm used to sort an array of 7
integer values. These are the steps a human would take to
emulate merge sort (top-down).

![Merge Sort](https://upload.wikimedia.org/wikipedia/commons/e/e6/Merge_sort_algorithm_diagram.svg)

## Quick Sort
Quick sort is a sorting technique that sequences a list by continuously dividing the list into two parts and moving the lower items to one side and the higher items to the other. It starts by picking one item in the entire list to serve as a pivot point. The pivot could be the first item or a randomly chosen one. All items that compare lower than the pivot are moved to the left of the pivot; all equal or higher items are moved to the right. It then picks a pivot for the left side and moves those items to left and right of the pivot and continues the pivot picking and dividing until there is only one item left in the group. It then proceeds to the right side and performs the same operation again.

![Quick Sort](https://upload.wikimedia.org/wikipedia/commons/9/9c/Quicksort-example.gif)

## Selection sort

Selection sort is the simplest sorting algorithm. It finds the smallest element in the array and swaps it with the first position in the array. Then the second smallest and swaps it with the second position etc.  

![Selection Sort](https://upload.wikimedia.org/wikipedia/commons/9/94/Selection-Sort-Animation.gif)  



| Algorithm | Time Complexity (best,average,worst) | Space Complexity |
|---------|-------------- |-----------|
|**Bubble Sort**|O(n), O(n<sup>2</sup>), O(n<sup>2</sup>)|O(1)|
|**Insertion Sort**|O(n), O(n<sup>2</sup>), O(n<sup>2</sup>)|O(1)|
|**Merge Sort**|O(n log(n))|O(n)|
|**Quick Sort**|O(n log(n)), O(n log(n)), O(n<sup>2</sup>)|O(log(n))|
|**Selection Sort**|O(n<sup>2</sup>), O(n<sup>2</sup>), O(n<sup>2</sup>)|O(1)|
