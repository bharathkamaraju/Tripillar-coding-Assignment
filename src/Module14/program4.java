

package Module14;

import java.util.*;

public class program4 {
    private int vertices;
    private List<List<Integer>> adjList;

    // Constructor
    public program4(int v) {
        vertices = v;
        adjList = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    // Add edge (undirected graph)
    public void addEdge(int src, int dest) {
        adjList.get(src).add(dest);
        adjList.get(dest).add(src);
    }

    // DFS helper to detect cycle
    private boolean dfsCycle(int node, boolean[] visited, int parent) {
        visited[node] = true;

        for (int neighbor : adjList.get(node)) {
            if (!visited[neighbor]) {
                if (dfsCycle(neighbor, visited, node)) {
                    return true;
                }
            } else if (neighbor != parent) {
                // Found a back edge → cycle
                return true;
            }
        }
        return false;
    }

    // Main cycle detection function
    public boolean hasCycle() {
        boolean[] visited = new boolean[vertices];
        for (int i = 0; i < vertices; i++) {
            if (!visited[i]) {
                if (dfsCycle(i, visited, -1)) {
                    return true;
                }
            }
        }
        return false;
    }

    // Driver code
    public static void main(String[] args) {
        program4 g = new program4(5);

        // Example graph
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.addEdge(4, 1); // This edge creates a cycle

        if (g.hasCycle()) {
            System.out.println("Graph contains a cycle");
        } else {
            System.out.println("Graph does not contain a cycle");
        }
    }

}

