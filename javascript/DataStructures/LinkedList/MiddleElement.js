/*
Asked by - Flipkart, Adobe, Microsoft, VMWare, Samsung ...

Given a singly linked list, find middle of the linked list.
For example, if given linked list is 1->2->3->4->5 then output should be 3. 

If there are even nodes, then there would be two middle nodes,
we need to print second middle element. For example,
if given linked list is 1->2->3->4->5->6 then output should be 4.
*/


//constructor - called every time a new object is created.
function Node(data,next){
    this.data = data
    this.next = next
}

// setup some nodes and connect them to each other.
// the linked list looks like:
// (head) n5 -> n4 -> n3 -> n2 -> n1 -> null

let n1 = new Node("Bapusaheb", null) 
let n2 = new Node("makes", n1)
let n3 = new Node("lame", n2)
let n4 = new Node("memes", n3)
let n5 = new Node("everytime", n4)

// assign a node as the head of the list.
let head = n5

// here we use two pointers, fastPointer and slowPointer where fastPointer is incremented twice 
// while slowPointer is incremented once. when fastPointer reaches the end of the list,slowPointer will be
// pointing to the middle of the linked list. Voila!
let fastPointer = head
let slowPointer = head
while(fastPointer.next !== null && fastPointer.next.next !== null){
    fastPointer = fastPointer.next.next
    slowPointer = slowPointer.next
}

slowPointer.data // returns the data in the middle of the linked list. ;-)