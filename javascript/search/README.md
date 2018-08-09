# Searching techniques

## Binary Search

Binary search is used to perform a very efficient search on sorted dataset. The time complexity is `O(log2N)`. Idea is to repeatedly divide in half the portion of the list that could contain the item, until we narrow it down to one possible item.

![binary search](https://camo.githubusercontent.com/0444b608b78c3b30c443095b5f7c57ecaa8ab52c/68747470733a2f2f626c6f672e70656e6a65652e636f6d2f77702d636f6e74656e742f75706c6f6164732f323031352f30342f62696e6172792d616e642d6c696e6561722d7365617263682d616e696d6174696f6e732e676966)

## Binary Search Tree

**Binary tree** is a tree data structure in which each node has at most two children,
which are referred to as the left child and the right child.

**Binary search tree** 
* keep their keys in the sorted order so that lookup and other operations can use the principle of binary search.
* each comparison allows the operations to skip about half of the tree, so that each lookup, insertion or deletion takes time proportional to the logarithm of the number of items stored in the tree.
* This is much better than the linear time required to find items by key in an (unsorted) array but slower than the corresponding operations on hash tables.