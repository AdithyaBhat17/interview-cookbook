class Graph {
  constructor(maxVertices) {
    this.maxVertices = maxVertices;
    this.adjacencyList = new Map();
  }

  addVertex(vertex) {
    if (this.adjacencyList.size >= this.maxVertices)
      throw new Error("Exceeded number of vertices");
    this.adjacencyList.set(vertex, []);
  }

  // assuming the graph is a undirected graph
  addEdge(vertexA, vertexB) {
    let neighboursOfA = this.adjacencyList.get(vertexA);
    let neighboursOfB = this.adjacencyList.get(vertexB);
    if (
      neighboursOfA.indexOf(vertexB) !== -1 ||
      neighboursOfB.indexOf(vertexA) !== -1
    )
      throw new Error("Duplicated edges");
    neighboursOfA.push(vertexB);
    neighboursOfB.push(vertexA);
  }

  displayGraph() {
    const vertices = this.adjacencyList.keys();
    for (const vertex of vertices) {
      const edges = this.adjacencyList.get(vertex);
      let neighbours = "";
      for (const edge of edges) {
        neighbours += edge + " ";
      }
      console.log(`${vertex} --> ${neighbours}`);
    }
  }
}

/**
 * Creates and returns a graph using adjacencyList
 * @param {any[]} adjacencyList
 */
const createGraph = function (adjacencyList) {
  let vertices = [...new Set(adjacencyList.flat())];
  const graph = new Graph(vertices.length);
  for (const vertex of vertices) {
    graph.addVertex(vertex);
  }
  for (const [vertexA, vertexB] of adjacencyList) {
    graph.addEdge(vertexA, vertexB);
  }
  graph.displayGraph();
  return graph;
};

export default { createGraph };
