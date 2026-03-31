

package Module14;

import java.util.*;

public class program1 {
    static class Graph {
        private int vertices; // number of vertices
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
            adjacencyList[dest].add(src); // for undirected graph
        }

        // Print adjacency list
        void printGraph() {
            for (int i = 0; i < vertices; i++) {
                System.out.print("Vertex " + i + ": ");
                for (Integer node : adjacencyList[i]) {
                    System.out.print(node + " ");
                }
                System.out.println();
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        Graph g = new Graph(5); // create graph with 5 vertices

        g.addEdge(0, 1);
        g.addEdge(0, 4);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);

        System.out.println("Adjacency List Representation of Graph:");
        g.printGraph();
    }
}
