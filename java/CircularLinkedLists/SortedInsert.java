// Sorted insert for circular linked list

// Algorithm:
// Allocate memory for the newly inserted node and put data in the newly allocated node.
// Let the pointer to the new node be new_node. After memory allocation,
// following are the three cases that need to be handled.

// 1) Linked List is empty:  
//     a)  since node is the only node in CLL, make a self loop.      
//           node->next = node;  
//     b) change the head pointer to point to new node.
//           head = node;
// 2) New node is to be inserted just before the head node:    
//   (a) Find out the last node using a loop.
//          while(current.next != head)
//             current = current.next;
//   (b) Change the next of last node. 
//          current.next = node;
//   (c) Change next of new node to point to head.
//          node.next = head;
//   (d) change the head pointer to point to new node.
//          head = node;
// 3) New node is to be  inserted somewhere after the head: 
//    (a) Locate the node after which new node is to be inserted.
//          while ( current.next!= head && 
//              current.next.data < node.data)
//          {   current = current.next;   }
//    (b) Make next of node as next of the located pointer
//          node.next = current.next;
//    (c) Change the next of the located pointer
//          current.next = node; 

class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}

class CircularLinkedList{
    Node head;
    CircularLinkedList(){
        head = null;
    }

    public void sortAndInsert(Node node){
        Node current = head;
        if(current == null){ // step 1.
            node.next = node;
            head = node;
        }
        else if(node.data < current.data){ // step 2.
            /* If value is smaller than head's value then
             we need to change next of last node */
            while(current.next != head)
                current = current.next;
            current.next = node;
            node.next = head;
            head = node;
        }
        else{ //step 3.
            while(current.next != head && node.data >= current.data)
                current = current.next;
            node.next = current.next;
            current.next = node;
        }
    }

    public void print(){
        if(head != null){
            Node node = head;
            do{
                System.out.print(node.data + "->");
                node = node.next;
            }while(node != head);
        }
        System.out.println("null");
    }

    public static void main(String args[]){
        CircularLinkedList c = new CircularLinkedList();
        int array[] = new int[] {12,23,24,5,67,34};
        Node temp = null; //empty CircularLinkedList
        for(int i=0;i<array.length;i++){
            temp = new Node(array[i]);
            c.sortAndInsert(temp);
        }
        c.print();
    }
}