// Convert a Binary Tree to a Circular Doubly Link List
// Given a Binary Tree, convert it to a Circular Doubly Linked List (In-Place).

// The left and right pointers in nodes are to be used as previous and next pointers
// respectively in converted Circular Linked List.
// The order of nodes in List must be same as Inorder of the given Binary Tree.
// The first node of Inorder traversal must be head node of the Circular List.

// The idea can be described using below steps.
// 1) Write a general purpose function that concatenates two given circular doubly lists (This function is explained below).
// 2) Now traverse the given tree
// .a) Recursively convert left subtree to a circular DLL. Let the converted list be leftList.
// .b) Recursively convert right subtree to a circular DLL. Let the converted list be rightList.
// .c) Make a circular linked list of root of the tree, make left and right of root to point to itself.
// .d) Concatenate leftList with list of single root node.
// .e) Concatenate the list produced in step above (d) with rightList.

// How to Concatenate two circular DLLs?

// * Get the last node of the left list. Retrieving the last node is an O(1) operation,
// since the prev pointer of the head points to the last node of the list.
// * Connect it with the first node of the right list
// * Get the last node of the second list
// * Connect it with the head of the list.

class Node{
    int data;
    Node left,right;
    public Node(int data){
        this.data = data;
        left = right = null;
    }
}

class Tree{
    Node root;
    public Tree(){
        root = null;
    }

    public Node concatenate(Node leftList,Node rightList){
        if(leftList == null) return rightList;
        if(rightList == null) return leftList;

        Node leftLast = leftList.left;
        Node rightLast = rightList.left;

        //connect end of first list to start of second list
        leftLast.right = rightList;
        rightList.left = leftLast;
        //left of first node refers to the last node in the list
        leftList.left = rightLast;
        // Right of last node refers to the first node of the List
        rightLast.right = leftList;
        // Return the Head of the List
        return leftList;
    }

    public Node bTreeToCList(Node root){
        if (root == null)
            return null;

        // Recursively convert left and right subtrees
        Node left = bTreeToCList(root.left);
        Node right = bTreeToCList(root.right);
 
        // Make a circular linked list of single node
        // (or root). To do so, make the right and
        // left pointers of this node point to itself
        root.left = root.right = root;
 
        // Step 1 (concatenate the left list with the list 
        //         with single node, i.e., current node)
        // Step 2 (concatenate the returned list with the
        //         right List)
        return concatenate(concatenate(left, root), right);
    }

    public void display(Node head){
        System.out.println("Circular Linked List is :");
        Node itr = head;
        do{
            System.out.print(itr.data+ " " );
            itr = itr.right;
        }while (itr != head);
        System.out.println();
    }
}

class Main{
    public static void main(String args[]){
        // Build the tree
        Tree tree = new Tree();
        tree.root = new Node(10);
        tree.root.left = new Node(12);
        tree.root.right = new Node(15);
        tree.root.left.left = new Node(25);
        tree.root.left.right = new Node(30);
        tree.root.right.left = new Node(36);
    
        // head refers to the head of the Link List
        Node head = tree.bTreeToCList(tree.root);
        // Display the Circular LinkedList
        tree.display(head);
    }
}
