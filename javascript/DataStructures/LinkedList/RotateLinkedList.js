/*
Given a singly linked list, rotate the linked list counter-clockwise by k nodes.
Where k is a given positive integer smaller than or equal to length of the linked list.
For example, if the given linked list is 10->20->30->40->50->60 and k is 4,
the list should be modified to 50->60->10->20->30->40.
*/

// Input - 
let input = {
    value: 10,
    next: {
        value: 20,
        next: {
            value: 30,
            next: {
                value: 40,
                next: {
                    value: 50,
                    next: {
                        value: 60,
                        next: null
                    }
                }
            }
        }
    }
}

const rotate = (head,k) => {
    let previousHead = head,
        previous = head,
        current = head,
        i = 1;
    while(current.next){
        if(i === k+1){
            head = current
            previous.next = null
        }
        previous = current
        current = current.next
        i++
    }
    current.next = previousHead
    return head
}




rotate(input,3)