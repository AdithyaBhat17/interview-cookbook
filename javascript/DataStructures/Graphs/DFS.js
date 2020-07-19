const { createGraph } = require("./index");

const { maxVertices, adjacencyList } = createGraph([
  [1, 0],
  [2, 0],
  [3, 1],
  [3, 2],
]);

console.log(dfs(0));

function dfs(vertex) {
  // initialize the visited array with false.
  let visited = new Array(maxVertices).fill(false);
  dfsUtil(vertex, visited);

  // a recursive utility function to explore all adjacent vertices of the 'vertex'
  function dfsUtil(vertex, visited) {
    // mark the current vertex as visited and print it
    visited[vertex] = true;
    console.log(vertex);

    // get all neighbours of the current vertex
    const neighbours = adjacencyList.get(vertex);
    // now explore each and every vertex recursively until all vertices are visited.
    for (const neighbour of neighbours) {
      if (!visited[neighbour]) {
        dfsUtil(neighbour, visited);
      }
    }
  }
}
