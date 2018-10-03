class LinkedList {   
    static Node head;   
    static class Node {   
        int data; 
        Node next, prev;   
        Node(int d) { 
            data = d; 
            next = prev = null; 
        } 
    }   
    /* Function to reverse a Doubly Linked List */
    void reverse() { 
        Node temp = null; 
        Node current = head;   
        /* swap next and prev for all nodes of  
         doubly linked list */
        while (current != null) { 
            temp = current.prev; 
            current.prev = current.next; 
            current.next = temp; 
            current = current.prev; 
        }   
        /* Before changing head, check for the cases like empty  
         list and list with only one node */
        if (temp != null) { 
            head = temp.prev; 
        } 
    } 
    /* Function to insert a node at the beginging of the Doubly Linked List */
    void push(int new_data) { 
        /* allocate node */
        Node new_node = new Node(new_data);   
        /* since we are adding at the begining,  
         prev is always NULL */
        new_node.prev = null;   
        /* link the old list off the new node */
        new_node.next = head;   
        /* change prev of head node to new node */
        if (head != null) { 
            head.prev = new_node; 
        }   
        /* move the head to point to the new node */
        head = new_node; 
    } 
    void printList(Node node) { 
        while (node != null) { 
            System.out.print(node.data + " "); 
            node = node.next; 
        } 
    } 
  
    public static void main(String[] args) { 
        LinkedList list = new LinkedList();   
        list.push(2); 
        list.push(4); 
        list.push(8); 
        list.push(10); 
  
        System.out.println("Original linked list "); 
        list.printList(head);   
        list.reverse(); 
        System.out.println(""); 
        System.out.println("The reversed Linked List is "); 
        list.printList(head); 
    } 
} 