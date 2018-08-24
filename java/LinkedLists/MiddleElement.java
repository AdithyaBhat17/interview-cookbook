class LinkedList{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
        }
    }
    public void printMiddleElement(){ // The same logic as followed in the ES6 javascript code (Checkout the js folder in the repo) 
        Node slowPointer = head;
        Node fastPointer = head;
        if(head != null){
            while(fastPointer != null && fastPointer.next != null){
                fastPointer = fastPointer.next.next;
                slowPointer = slowPointer.next;
            }
            System.out.println("The middle element is " + slowPointer.data);
        }
    }

    public void insertNode(int item){
        Node node = new Node(item);
        node.next = head;
        head = node.next; // move the head to point the next node
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
            llist.print();
            llist.printMiddleElement();
        }
    }
}