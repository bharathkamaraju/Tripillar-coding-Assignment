

package Module14;

import java.util.*;

public class program2 {
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

        // BFS traversal
        void BFS(int startVertex) {
            boolean[] visited = new boolean[vertices];
            Queue<Integer> queue = new LinkedList<>();

            visited[startVertex] = true;
            queue.add(startVertex);

            System.out.print("BFS Traversal starting from vertex " + startVertex + ": ");

            while (!queue.isEmpty()) {
                int current = queue.poll();
                System.out.print(current + " ");

                for (int neighbor : adjacencyList[current]) {
                    if (!visited[neighbor]) {
                        visited[neighbor] = true;
                        queue.add(neighbor);
                    }
                }
            }
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

        // Perform BFS starting from vertex 0
        g.BFS(0);
    }
}
