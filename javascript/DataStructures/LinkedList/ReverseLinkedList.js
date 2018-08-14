/*
Asked by - Cognizant, Cisco, Adobe, Microsoft, MakeMyTrip, Snapdeal, SAP labs, Qualcomm, PayTM,VMWare ...

Given pointer to the head node of a linked list, the task is to reverse the linked list.

Input: You need to complete a method reverse() that takes head as argument and returns new head.
Output: Reverse the linked list and return head of the modified list.
*/

// TESTCASE :
// let input = {
//     value: 1,
//     next: {
//        value: 2,
//        next: {
//           value: 3,
//           next: {
//              value: 4,
//              next: null
//              }
//           }
//      }
//  }

//  reverse(input) - iterative
//  reverse(input,1) - recursion
//  reverse(input,) - third approach

// 1. Iterative Approach.
const reverse = (head) => {
    let result = null
    let stack = []
    let current = head
    while(current){
        stack.push(current)
        current = current.next
    }
    // set head to the end of the linkedlist.
    result = stack.pop() || []
    current = result
    while(current){ // pop the rest of the data.
        current.next = stack.pop()
        current = current.next
    } 
    return result
}

// 2. Recursive Approach.
const reverse = (node,parent) => {
    let result = parent || {}
    if(node){
        let child = node.next
        node.next = parent
        result = reverse(child,node)
    }
    return result
}

// 3. Time to impress the interviewer ;-)
const reverse = (input,reversedList) => input === null ? reversedList 
    : reverse(input.next, Object.assign(input,{next:reversedList || null}))

// Object.assign - MDN Docs (https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/assign)



