const { createGraph } = require("./index");

const { maxVertices, adjacencyList } = createGraph([
  [1, 0],
  [2, 0],
  [3, 1],
  [3, 2],
]);

console.log(bfs(1));

function bfs(vertex) {
  // initialize the visited array with false.
  let visited = new Array(maxVertices).fill(false);

  // create a Queue to traverse through the graph
  let queue = [];

  // mark the vertex as visited.
  queue.push(vertex);
  visited[vertex] = true;

  while (queue.length) {
    // remove the vertex from the queue and print it.
    vertex = queue.pop();
    console.log(vertex);

    // fetch all neighbours of the current vertex
    const neighbours = adjacencyList.get(vertex);

    // loop through the list of neighbours and add the vertex to the queue if
    // its not visited yet.
    for (const neighbour of neighbours) {
      if (!visited[neighbour]) {
        visited[neighbour] = true;
        queue.push(neighbour);
      }
    }
  }
}
