/*
Asked by - Samsung, Oracle, Amazon

Implement a Queue using Linked List.
*/

let Queue = {front:null, back:null} // Initialize empty queue.

// constructor to implement a LL.
function Node(data,next){
    this.data = data
    this.next = next
}

// Adding elements to the queue with time complexity - O(1) 
function Enqueue(element){
    let N = new Node(element,null)
    if(Queue.back === null){
        Queue.front = N
        Queue.back = N
    }else{
        Queue.back.next = N
        Queue.back = Queue.back.next
    }
}

// Remove the front element from the Queue with time complexity - O(1)
function Dequeue(){
    if(Queue.front !== null){
        let first = Queue.front
        Queue.front = Queue.front.next
        return first.data
    }else{
        if(Queue.back !== null)
            Queue.back = null
        return `Queue is empty`
    }
}

Enqueue(1); 
Enqueue(2); 
Enqueue(3); 
Dequeue();