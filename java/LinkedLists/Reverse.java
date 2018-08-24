// Given pointer to the head node of a linked list, the task is to reverse the linked list.
// We need to reverse the list by changing links between nodes.

// Examples:

// Input : Head of following linked list  
//        1->2->3->4->NULL
// Output : Linked list should be changed to,
//        4->3->2->1->NULL

// Input : Head of following linked list  
//        1->2->3->4->5->NULL
// Output : Linked list should be changed to,
//        5->4->3->2->1->NULL

// Input : NULL
// Output : NULL

// Input  : 1->NULL
// Output : 1->NULL

// Algorithm - iterative
// 1. Initialize three pointers prev as NULL, curr as head and next as NULL.
// 2. Iterate trough the linked list. In loop, do following.
// Before changing next of current,
// store next node
// next = curr->next
// Now change next of current
// This is where actual reversing happens
// curr->next = prev

// Move prev and curr one step forward
// prev = curr
// curr = next

// Time Complexity: O(n)
// Space Complexity: O(1)

class LinkedList{
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    public void print(Node node){ //pass the changed head as a parameter.
        while(node != null){
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println("null");
    }
    
    Node reverse(Node node){
        Node prev = null;
        Node current = node;
        Node next = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    public static void main(String args[]){
        LinkedList llist = new LinkedList();
        llist.head = new Node(1);
        llist.head.next = new Node(2);
        llist.head.next.next = new Node(3);
        llist.head.next.next.next = new Node(4);
        llist.head.next.next.next.next = new Node(5);
        System.out.println("Original list - ");
        llist.print(head);
        
        head = llist.reverse(head);
        System.out.println("Reversed list - ");
        llist.print(head);
    }
}