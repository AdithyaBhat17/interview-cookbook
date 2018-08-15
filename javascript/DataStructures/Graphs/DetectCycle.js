/*
Asked by - Flipkart, MakeMyTrip, Amazon, Adobe, Samsung, Oracle, Microsoft.

Given a directed graph  your task is to complete the method isCycle  to detect if there is a cycle in the graph or not.
*/

// Hmm.. let us try this with Prototypical inheritance..

function Graph(){
    this.adjList = {}
}

Graph.prototype.addVertex = function(vertex){
    this.adjList[vertex] = []
}

Graph.prototype.addEdge = function(vertex1,vertex2){
    this.adjList[vertex1].push(vertex2)
}


//modified version of dfs
Graph.prototype.isCycle = function(){
    const nodes = Object.keys(this.adjList)
    const visited = {}
    const stack = {}
    for(let i=0;i<nodes.length;i++){
        const node = nodes[i]
        if(this._detectCycleUtil(node,visited,stack))
            return `Cycle found!`
    } 
    return `No Cycle!`
} 

Graph.prototype._detectCycleUtil = function(vertex,visited,stack){
    if(!visited[vertex]){
        visited[vertex] = true
        stack[vertex] = true
        const neighbours = this.adjList[vertex]
        for(let i=0;i<neighbours.length;i++){
            let neighbour = neighbours[i]
            console.log('parent',vertex,'Child',neighbour)
            if(!visited[neighbour] && this._detectCycleUtil(neighbour,visited,stack)){
                return true
            }else if(stack[neighbour]){
                return true
            }
        }
    }
    stack[vertex] = false
    return false
}

const g = new Graph()

g.addVertex('A')
g.addVertex('B')
g.addVertex('C')
g.addVertex('D')
g.addVertex('E')

g.addEdge('A','B')
g.addEdge('D','E')
g.addEdge('C','E')
g.addEdge('A','D')
g.addEdge('A','C')
g.addEdge('E','B')
g.addEdge('D','B')
g.addEdge('E','A')

g.isCycle()