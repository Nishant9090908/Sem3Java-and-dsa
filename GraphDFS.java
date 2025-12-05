import java.util.*;

public class GraphDFS {
    private int[][] adjMatrix;   // adjacency matrix
    private int numVertices;     // number of vertices

    // Constructor
    public GraphDFS(int numVertices) {
        this.numVertices = numVertices;
        adjMatrix = new int[numVertices][numVertices];
    }

    // Add edge (undirected graph)
    public void addEdge(int i, int j) {
        adjMatrix[i][j] = 1;
        adjMatrix[j][i] = 1;
    }

    // DFS helper function
    private void dfsUtil(int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");  // print current vertex

        // Explore neighbors
        for (int i = 0; i < numVertices; i++) {
            if (adjMatrix[vertex][i] == 1 && !visited[i]) {
                dfsUtil(i, visited);
            }
        }
    }

    // DFS traversal starting from a given vertex
    public void dfs(int startVertex) {
        boolean[] visited = new boolean[numVertices];
        System.out.println("DFS Traversal starting from vertex " + startVertex + ":");
        dfsUtil(startVertex, visited);
    }

    // Main method to test
    public static void main(String[] args) {
        GraphDFS g = new GraphDFS(5); // graph with 5 vertices (0 to 4)

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);

        g.dfs(0); // start DFS from vertex 0
    }
}