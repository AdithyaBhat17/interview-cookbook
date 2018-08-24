// Given two Linked Lists, create union and intersection lists that contain union and intersection
// of the elements present in the given lists. Order of elments in output lists doesn’t matter.

// Example:

// Input:
//    List1: 10->15->4->20
//    list2:  8->4->2->10
// Output:
//    Intersection List: 4->10
//    Union List: 2->8->20->4->15->10

class LinkedList{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void insertNode(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    public void print(){
        Node node = head;
        while(node != null){
            System.out.print(node.data + "->");
            node = node.next;
        }
        System.out.println();
    }

    public void union(Node head1,Node head2){
        Node a = head1, b = head2;
        // insert all elements of list 1
        while(a != null){
            insertNode(a.data);
            a = a.next;
        }
        // insert all elements of list 2 that are not present in list 1
        while(b != null){
            if(!isPresent(head,b.data))
                insertNode(b.data);
            b = b.next;
        }
    }

    public void intersection(Node head1, Node head2){
        Node result = null;
        Node a = head1;
        // check if any element of a is present in b.If present,add it to the result.
        while(a != null){
            if(isPresent(head2,a.data)) 
                insertNode(a.data);
            a = a.next;
        }  
    } 

    boolean isPresent(Node head,int data){
        Node node = head;
        while(node != null){
            if(node.data == data)
                return true;
            node = node.next;
        }
        return false;
    }

    public static void main(String args[]){
        LinkedList listA = new LinkedList();
        LinkedList listB = new LinkedList();
        LinkedList union = new LinkedList();
        LinkedList intersection = new LinkedList();

        listA.insertNode(20);
        listA.insertNode(4);
        listA.insertNode(15);
        listA.insertNode(10);

        listB.insertNode(10);
        listB.insertNode(2);
        listB.insertNode(4);
        listB.insertNode(8);

        intersection.intersection(listA.head,listB.head);
        union.union(listA.head,listB.head);

        intersection.print();
        union.print();
    }
}