// Create a Doubly Linked List from a Ternary Tree
// Given a ternary tree, create a doubly linked list out of it. A ternary tree is just like binary tree but 
// instead of having two nodes, it has three nodes i.e. left, middle, right.

// The doubly linked list should holds following properties -

// Left pointer of ternary tree should act as prev pointer of doubly linked list.
// Middle pointer of ternary tree should not point to anything.
// Right pointer of ternary tree should act as next pointer of doubly linked list.
// Each node of ternary tree is inserted into doubly linked list before its subtrees and for any node, 
// its left child will be inserted first, followed by mid and right child (if any).

class newNode { 
    int data; 
    newNode left,middle,right; 
    public newNode(int data) { 
        this.data = data; 
        left = middle = right = null; 
    } 
} 
  
class GFG {       
    //tail of the linked list. 
    static newNode tail;  
  
    //function to push the node to the tail. 
    public static void push(newNode node) { 
        // to put the node at the end of the already existing tail. 
        tail.right = node;
        //to point to the previous node. 
        node.left = tail;          
        // middle pointer should point to nothing so null. initiate right pointer to null. 
        node.middle = node.right = null;            
        //update the tail position. 
        tail = node;              
    }       
    /* Create a doubly linked list out of given a ternary tree. 
    by traversing the tree in preorder fashion. */
    public static void ternaryTree(newNode node,newNode head) { 
        if(node == null) 
            return;                      
        newNode left = node.left; 
        newNode middle = node.middle; 
        newNode right = node.right; 
        if(tail != node)           
            // already root is in the tail so dont push  
            // the node when it was root.In the first  
            // case both node and tail have root in them. 
            push(node);              
              
        // First the left child is to be taken. 
        // Then middle and then right child. 
        ternaryTree(left,head);          
        ternaryTree(middle,head); 
        ternaryTree(right,head); 
    } 
  
    //function to initiate the list process. 
    public static newNode startTree(newNode root) { 
        //Initiate the head and tail with root. 
        newNode head = root; 
        tail = root; 
        ternaryTree(root,head);           
        //since the head,root are passed  
        // with reference the changes in  
        // root will be reflected in head. 
        return head;          
    } 
      
    // Utility function for printing double linked list. 
    public static void printList(newNode head) { 
        System.out.print("Created Double Linked list is:\n"); 
        while(head != null) { 
            System.out.print(head.data + " "); 
            head = head.right; 
        } 
    } 
      
    // Driver program to test above functions 
    public static void main(String args[]) {   
        newNode root = new newNode(30); 
        root.left = new newNode(5); 
        root.middle = new newNode(11); 
        root.right = new newNode(63); 
        root.left.left = new newNode(1); 
        root.left.middle = new newNode(4); 
        root.left.right = new newNode(8); 
        root.middle.left = new newNode(6); 
        root.middle.middle = new newNode(7); 
        root.middle.right = new newNode(15); 
        root.right.left = new newNode(31); 
        root.right.middle = new newNode(55); 
        root.right.right = new newNode(65); 

        newNode head = startTree(root);          
        printList(head); 
    } 
} 