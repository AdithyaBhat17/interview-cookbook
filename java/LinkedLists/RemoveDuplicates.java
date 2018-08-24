// Write a removeDuplicates() function which takes a list and deletes any duplicate nodes from the list.
// The list is not sorted.

// For example if the linked list is 12->11->12->21->41->43->21 then 
// removeDuplicates() should convert the list to 12->11->21->41->43.

import java.util.HashSet;
class LinkedList{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    static void removeDuplicates(Node head){
        HashSet<Integer> s = new HashSet<>();
        Node current = head;
        Node prev = null;
        while(current != null){
            int currentValue = current.data;
            if(s.contains(currentValue))
                prev.next = current.next; //skip that duplicate item.
            else{
                s.add(currentValue);
                prev = current;
            }
            current = current.next;
        }
    }

    static void print(Node node){
        while(node != null){
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String args[]){
        Node start = new Node(12);
        start.next = new Node(11);
        start.next.next = new Node(12);
        start.next.next.next = new Node(21);
        start.next.next.next.next = new Node(41);
        start.next.next.next.next.next = new Node(43);
        start.next.next.next.next.next.next = new Node(11);

        System.out.println("original list - ");
        print(start);

        System.out.println("After removal of duplicates - ");
        removeDuplicates(start);
        print(start);
    }
}