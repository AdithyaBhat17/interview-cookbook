// Given a linked list and two keys in it, swap nodes for two given keys.
// Nodes should be swapped by changing links. Swapping data of nodes may be expensive
// in many situations when data contains many fields.

// It may be assumed that all keys in linked list are distinct.

// Examples:

// Input:  10->15->12->13->20->14,  x = 12, y = 20
// Output: 10->15->20->13->12->14

// Input:  10->15->12->13->20->14,  x = 10, y = 20
// Output: 20->15->12->13->10->14

// Input:  10->15->12->13->20->14,  x = 12, y = 13
// Output: 10->15->13->12->20->14

class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}

class LinkedList{
    Node head;
    public void swapNodes(int x,int y){
        if(x == y) return;
        //look for x
        Node prevX = null,currentX = head;
        while(currentX != null && currentX.data != x){
            prevX = currentX;
            currentX = currentX.next;
        }
        //look for y
        Node prevY = null,currentY = head;
        while(currentY != null && currentY.data != y){
            prevY = currentY;
            currentY = currentY.next;
        }
        if(currentX == null || currentY == null) return;
        // if x is not head,then make y the new head.
        if(prevX != null)
            prevX.next = currentY;
        else
            head = currentY;
        // if y is not head,then make x the new head.
        if(prevY != null)
            prevY.next = currentX;
        else
            head = currentX;
        // swap next pointers.
        Node temp = currentX.next;
        currentX.next = currentY.next;
        currentY.next = temp;
    }

    public void insertNode(int item){
        Node node = new Node(item);
        node.next = head;
        head = node; // move the head to point the next node
    }

    public void print(){
        Node node = head;
        while(node != null){
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String args[]){
        LinkedList llist = new LinkedList();
        llist.insertNode(14);
        llist.insertNode(20);
        llist.insertNode(13);
        llist.insertNode(12);
        llist.insertNode(15);
        llist.insertNode(10);
        System.out.println("Before swap - ");
        llist.print();
        llist.swapNodes(12,20);
        System.out.println("After swap - ");
        llist.print();
    }
}