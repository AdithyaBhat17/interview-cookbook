/*

Asked by - SAP Labs, Amazon, Microsoft, Flipkart, Adobe.

Write a function to print the breadth first traversal for a undirected graph from a given source s.
*/

class Queue{//...  https://www.geeksforgeeks.org/implementation-queue-javascript/ }

class Graph{
    // ...  Implementation in
    // https://github.com/AdithyaBhat17/interview-cookbook/blob/master/javascript/DataStructures/Graphs/DFS.js

    // bfs function goes here
}

const bfs = (start) => {
    let visited = []
    for(let i=0;i<this.noOfVertices;i++)
        visited[i] = false
        
    let queue = new Queue()  //Implementation guide - https://www.geeksforgeeks.org/implementation-queue-javascript/
    visited[start] = true
    queue.enqueue(start) // add the starting node to the queue

    while(!queue.isEmpty){
        let element = queue.dequeue()
        console.log(element)

        let list = this.adjList.get(element)
        for(let i in list){
            let neighbour = list[i]
            if(!visited[i]){
                visited[neighbour] = true
                queue.enqueue(neighbour)
            }
        }
    }
}
