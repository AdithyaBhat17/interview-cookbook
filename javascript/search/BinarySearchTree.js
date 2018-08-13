/*
Binary tree - is a tree data structure in which each node has at most two children,
which are referred to as the left child and the right child.

Binary search tree - keep their keys in the sorted order so that lookup and other operations can use the principle of binary search.
- each comparison allows the operations to skip about half of the tree, so that each lookup, insertion or deletion takes time proportional to the logarithm of the number of items stored in the tree.
- This is much better than the linear time required to find items by key in an (unsorted) array but slower than the corresponding operations on hash tables.
*/

class BinarySearchTree {
    constructor() {
      this.root = null
    }  
    insertNode(val) {
        var node = {
            data: val,
            left: null,
            right: null
        };
  
        var currentNode
    
        if (!this.root) {
            this.root = node
        } else {
            currentNode = this.root
            while (currentNode) {
                if (val < currentNode.data) {
                    if (!currentNode.left) {
                        currentNode.left = node
                        break
                    } else {
                        currentNode = currentNode.left
                    }
                } else if (val > currentNode.data) {
                    if (!currentNode.right) {
                        currentNode.right = node
                        break
                    } else {
                        currentNode = currentNode.right
                    }
                } else {
                    console.log('Ignoring this value due to duplicate values')
                    break
                }
            }
        }
    }
}
  
var BST = new BinarySearchTree();
  
BST.insertNode(8);
BST.insertNode(3);
BST.insertNode(10);
BST.insertNode(1);
BST.insertNode(6);
BST.insertNode(14);
BST.insertNode(4);
BST.insertNode(7);
BST.insertNode(13);
  
console.log(BST);