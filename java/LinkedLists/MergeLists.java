// Write a SortedMerge() function that takes two lists, each of which is sorted in increasing order,
// and merges the two together into one list which is in increasing order.
// SortedMerge() should return the new list. The new list should be made by splicing
// together the nodes of the first two lists.

// For example if the first linked list a is 5->10->15 and the other linked list b is 2->3->20,
// then SortedMerge() should return a pointer to the head node of the merged list 2->3->5->10->15->20.

// There are many cases to deal with: either ‘a’ or ‘b’ may be empty,
// during processing either ‘a’ or ‘b’ may run out first,
// and finally there’s the problem of starting the result list empty,
// and building it up while going through ‘a’ and ‘b’.

public class Node{
    public int data;
    public Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class LinkedList{
    public Node head;
    public LinkedList(){
        head = null;
    }
    public void insertNodeAtBegin(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;
    }
    public void insertNodeAtEnd(int data) {
        if (head == null) {
            insertNodeAtBegin(data);
        } else {
            Node n = new Node(data);
            Node currNode = head;
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = n;
        }
    }
}

public class MergeLinkedLists{
    private LinkedList a;
    private LinkedList b;

    public MergeLinkedLists(LinkedList a,LinkedList b){
        this.a = a;
        this.b = b;
    }

    public LinkedList merge(){
        LinkedList result = new LinkedList();
        while(a.head != null && b.head != null){
            if(a.head.data < b.head.data){
                result.insertNodeAtEnd(a.head.data);
                a.head = a.head.next;
            }else{
                result.insertNodeAtEnd(b.head.data);
                b.head = b.head.next;
            }
        }
        while(a.head != null){ // b empty?
            result.insertNodeAtEnd(a.head.data);
            a.head = a.head.next;
        }
        while (b.head != null) {
            result.insertNodeAtEnd(b.head.data);
            b.head = b.head.next;
        }
        return result;
    }
    public void print(Node head){
        while(node != null){
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.println(" ");
    }

    public static void main(String args[]){
        LinkedList listA = new LinkedList();
        listA.insertNodeAtBegin(15);
        listA.insertNodeAtBegin(10);
        listA.insertNodeAtBegin(5);
        LinkedList listB = new LinkedList();
        listB.insertNodeAtBegin(20);
        listB.insertNodeAtBegin(3);
        listB.insertNodeAtBegin(2);

        MergeLinkedLists mergeA = new MergeLinkedLists(listA,listB);
        mergeA.print(listA.head);
        mergeA.print(listB.head);

        LinkedList result = new LinkedList();
        mergeA.print(result.head);
    }
}