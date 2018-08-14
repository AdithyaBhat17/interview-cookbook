/*
Asked by - Samsung, Microsoft, Codenation.

Implement Stack using LinkedList.
*/

class Node{
    constructor(data){
        this.data = data
        this.next = null
    }
}

class Stack{
    constructor(){
        this.top = null
    }
    push(item){
        let node = new Node(item)
        if(this.top){
            node.next = this.top
            this.top = node
        }else{
            this.top = node
        }
    }
    pop(){
        if(this.top){
            let itemToPop = this.top
            this.top = this.top.next
            return itemToPop.data 
        }else{
            console('Stack is empty!')
            return false
        }
    }
    peek(){
        if(this.top) {
            return this.top.data
        }else{
            return null
        }
    }
}

let stack = new Stack()
stack.push(10) // top: 10
stack.push(20) // top: 20
stack.push(30) // top: 30
stack.push(40) // top: 40
stack.pop() // top: 30
stack.peek() // 30