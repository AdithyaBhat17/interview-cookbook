/*

Asked by - Intuit, Amazon.

Write a function to print the depth first traversal for a undirected graph from a given source s.
*/

class Graph{
    constructor(noOfVertices){
        this.noOfVertices = noOfVertices
        this.adjList = new Map()
    }
    
    addVertex(v){
        this.adjList.set(v,[]) //init
    }

    addEdge(v,w){
        this.adjList.get(v).push(w)
        this.adjList.get(w).push(v) // undirected graph
    }

    printGraph(){
        let keys = this.adjList.keys()
        for(let i of keys){
            let values = this.adjList.get(i)
            let res = ""
            for(let j of values)
                res += j + " "
            console.log(i + " -> " + res) 
        }
    }

    dfs(start){
        let visited = []
        for(let i=0;i<this.noOfVertices;i++)
            visited[i] = false
        this.DFSutil(start,visited)
    }
    DFSutil(vertex,visited){
        visited[vertex] = true
        console.log(vertex)

        let neighbours = this.adjList.get(vertex)
        for(let i in neighbours){
            let element = neighbours[i]
            if(!visited[element])
                this.DFSutil(element,visited)
        }
    }
}

let graph = new Graph(6)

let vertices = [ 'A', 'B', 'C', 'D', 'E', 'F' ]
 
// adding vertices
for (let i = 0; i < vertices.length; i++) {
    graph.addVertex(vertices[i])
}
 
// adding edges
graph.addEdge('A', 'B')
graph.addEdge('A', 'D')
graph.addEdge('A', 'E')
graph.addEdge('B', 'C')
graph.addEdge('D', 'E')
graph.addEdge('E', 'F')
graph.addEdge('E', 'C')
graph.addEdge('C', 'F')

graph.printGraph()

console.log("DFS")
graph.dfs('A')