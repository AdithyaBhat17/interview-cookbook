// Split a Circular Linked List into two halves
// If there are odd number of nodes, then first list should contain one extra.

// 1) Store the mid and last pointers of the circular linked list using tortoise and hare algorithm.(Floyd)
// 2) Make the second half circular.
// 3) Make the first half circular.
// 4) Set head (or start) pointers of the two linked lists.

// In the below implementation,
// if there are odd nodes in the given circular linked list 
// then the first result list has 1 more node than the second result list.

class CircularLinkedList{
    static Node head,headA,headB;

    static class Node{
        int data;
        Node prev,next;
        Node(int data){
            this.data = data;
            prev = next = null;
        }
    }

    public void splitList(){
        Node hare = head;
        Node tortoise = head;
        
        if(head == null) return;

        /* If there are odd nodes in the circular list then
         hare->next becomes head and for even nodes 
         hare->next->next becomes head */
        while(hare.next != head && hare.next.next != head){
            hare = hare.next.next;
            tortoise = tortoise.next;
        }
        /* If there are even elements in list then move hare */
        while(hare.next.next == head)
            hare = hare.next;
        
        /* Set the head pointer of first half */
        headA = head;
        /* Set the head pointer of second half */
        if (head.next != head) {
            headB = tortoise.next;
        }
        /* Make second half circular */
        hare.next = tortoise.next;
 
        /* Make first half circular */
        tortoise.next = head;
    }

    void print(Node node) {
        Node temp = node;
        if (node != null) {
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != node);
        }
    }

    public static void main(String[] args) {
        CircularLinkedList c = new CircularLinkedList();
 
        //Created linked list will be 12->56->2->11
        c.head = new Node(12);
        c.head.next = new Node(56);
        c.head.next.next = new Node(2);
        c.head.next.next.next = new Node(11);
        c.head.next.next.next.next = c.head;
 
        System.out.println("Original Circular Linked list ");
        c.print(head);
 
        // Split the list
        c.splitList();
        System.out.println("");
        System.out.println("First Circular List ");
        c.print(headA);
        System.out.println("");
        System.out.println("Second Circular List ");
        c.print(headB);
         
    }
}
