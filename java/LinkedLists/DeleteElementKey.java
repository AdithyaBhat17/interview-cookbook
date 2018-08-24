// Given a singly linked list and a position, delete a linked list node with the given key

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
    public void print(){
        Node node = head;
        while(node!=null){
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.println("null");
    }
    public void deleteNode(int key){
        Node temp = head;
        Node prev = null;
        if(temp != null && temp.data == key){
            head = temp.next;
            return;
        }
        //keep track of prev node inorder to delete temp.next
        while(temp != null && temp.data != key){
            prev = temp;
            temp = temp.next;
        }
        if(temp == null) return; //key not present :(
        prev.next = temp.next; //unlink the node
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