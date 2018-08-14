/*
Asked by - Microsoft, Amazon, Snapdeal.

Given a singly linked list of integers,
Your task is to complete the function isPalindrome that returns true
if the given list is palindrome, else returns false.
*/

// TODO : 
// Create a new copy of the linked list.
// Reverse the newly created linked list.
// Compare the original linked list with the reversed linked list.

function Node(data){
    this.data = data
    this.next = null
}

Node.prototype.add = function(data){
    const end = new Node(data)
    let current = this
    while(current.next !== null)
        current = current.next
    current.next = end
    return end 
}

const isPalindrome = (list) => {
    const reversed = reverseAndClone(list)
    return isEqual(list, reversed)
}

const reverseAndClone = node => {
    let head = null
    while(node){
        const copy = new Node(node.data)
        copy.next = head
        head = copy
        node = node.next
    }
    return head
}

const isEqual = (one, two) => {
    while(one && two){
        if(one.data !== two.data)
            return false
        one = one.next
        two = two.next
    }
    return one === null && two === null
}

const list = new Node(5)
list.add(4)
list.add(3)
list.add(4)
list.add(5)
isPalindrome(list) // true



