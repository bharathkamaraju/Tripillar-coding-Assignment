

package Module14;

import java.util.*;

public class program3 {
    // Graph class
    static class Graph {
        private int vertices;
        private LinkedList<Integer>[] adjacencyList;

        // Constructor
        Graph(int v) {
            vertices = v;
            adjacencyList = new LinkedList[v];
            for (int i = 0; i < v; i++) {
                adjacencyList[i] = new LinkedList<>();
            }
        }

        // Add edge
        void addEdge(int src, int dest) {
            adjacencyList[src].add(dest);
            adjacencyList[dest].add(src); // undirected graph
        }

        // DFS traversal (recursive)
        void DFSUtil(int vertex, boolean[] visited) {
            visited[vertex] = true;
            System.out.print(vertex + " ");

            for (int neighbor : adjacencyList[vertex]) {
                if (!visited[neighbor]) {
                    DFSUtil(neighbor, visited);
                }
            }
        }

        // DFS starting from a given vertex
        void DFS(int startVertex) {
            boolean[] visited = new boolean[vertices];
            System.out.print("DFS Traversal starting from vertex " + startVertex + ": ");
            DFSUtil(startVertex, visited);
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {
        Graph g = new Graph(6); // graph with 6 vertices (0 to 5)

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
        g.addEdge(3, 5);
        g.addEdge(4, 5);

        System.out.println("Adjacency List Representation of Graph:");
        for (int i = 0; i < 6; i++) {
            System.out.println("Vertex " + i + ": " + g.adjacencyList[i]);
        }

        // Perform DFS starting from vertex 0
        g.DFS(0);
    }
}
