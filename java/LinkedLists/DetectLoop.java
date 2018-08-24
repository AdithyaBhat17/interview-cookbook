// Given a singly linked list, detect whether the given LL has a loop.
import java.util.*;

class LinkedList
{
    static Node head;  // head of list
 
    /* Linked list Node*/
    static class Node
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
    public static void insertNode(int item){
        Node node = new Node(item);
        node.next = head;
        head = node;
    }
    public static boolean detectLoop(Node x){
        HashSet<Node> s = new HashSet<Node>();
        while(x != null){
            if(s.contains(x))
                return true; // if node is already present,then a loop exists
            s.add(x);
            x = x.next;
        }
        return false;
    }
    public static void main(String args[]){
        LinkedList llist = new LinkedList();
        llist.insertNode(1);
        llist.insertNode(2);
        llist.insertNode(3);
        llist.insertNode(4);
        llist.insertNode(5);
        llist.head.next.next = llist.head;
        if(detectLoop(head))
            System.out.println("Loop found");
        else
            System.out.println("No loop :)");
    }
}