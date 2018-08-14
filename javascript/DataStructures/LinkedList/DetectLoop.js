/*
Asked by - PayTM, Amazon, MakeMyTrip, Snapdeal, VMWare, Samsung, Qualcomm, Walmart.

Given a linked list, check if the the linked list has a loop.

Create a function that returns true if a linked list contains a cycle, or false if it terminates
Usually we assume that a linked list will end with a null next pointer, for example:
A -> B -> C -> D -> E -> null
A 'cycle' in a linked list is when traversing the list would result in visiting the same nodes over and over
This is caused by pointing a node in the list to another node that already appeared earlier in the list. Example:
A -> B -> C
    ^    |
    |    v
    E <- D
Example code:
const nodeA = new Node('A');
const nodeB = nodeA.next = new Node('B');
const nodeC = nodeB.next = new Node('C');
const nodeD = nodeC.next = new Node('D');
const nodeE = nodeD.next = new Node('E');
hasCycle(nodeA); // => false
nodeE.next = nodeB;
hasCycle(nodeA); // => true
Constraint 1: Do this in linear time
Constraint 2: Do this in constant space
Constraint 3: Do not mutate the original nodes in any way
Hint: Search for Floyd's Tortoise and Hare algorithm.
*/

function Node(data){
    this.data = data
    this.next = null
}

// You can read more on cycle detection at https://en.wikipedia.org/wiki/Cycle_detection
// but the main takeaway is that if hare moves twice as fast as tortoise
// then a loop would be identifiable as the hare will eventually catch up with the tortoise.

const hasCycle = (head) => {
    let tortoise = head
    let hare = head
    do{
        if(hare.next === null)
            return false
        hare = hare.next
        if(hare.next === null)
            return false
        hare = hare.next
        tortoise = tortoise.next
    }while(tortoise !== hare)
    return true
}

const n1 = new Node('A');
const n2 = n1.next = new Node('B');
const n3 = n2.next = new Node('C');
const n4 = n3.next = new Node('D');
const n5 = n4.next = new Node('E');
console.log(hasCycle(n1)); // => false
n5.next = n2;
console.log(hasCycle(n1)); // => true
