// Given a singly linked list and a position, delete a linked list node at the given position

class LinkedList
{
    Node head;  // head of list
 
    /* Linked list Node*/
    class Node
    {
        int data;
        Node next;
          
        // Constructor to create a new node
        // Next is by default initialized
        // as null
        Node(int d) {
            data = d;
            next=null;
        }
    }
    // Insert a new node at front
    public void insertNode(int item){
        Node node = new Node(item);
        node.next = head;
        head = node; // move the head to point the next node
    }
    public void deleteNode(int position){
        if(head == null) return; //empty linked list ?
        Node temp = head;
        if(position == 0){
            head = temp.next; // change head
            return;
        }
        // Let's find the previous node next to the node to be deleted.
        for(int i=0;temp != null && i<position - 1;i++)
            temp = temp.next;
        //invalid position (greater than the number of nodes)?
        if(temp == null || temp.next == null) return;
        // temp.next is the node to be deleted.
        //we can achieve this by storing the pointer next to the node to be deleted and remove the link from the list
        Node next = temp.next.next;
        temp.next = next;
    }
    public void print(){
        Node node = head;
        while(node != null){
            System.out.print(node.data + "->");
            node = node.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]){
        LinkedList llist = new LinkedList();
        for(int i=5;i>0;--i){
            llist.insertNode(i);
        }
        System.out.println("Linked list - ");
        llist.print();
        llist.deleteNode(3); //Delete node at position 3
        System.out.println("After deletion - ");
        llist.print();
    }
}