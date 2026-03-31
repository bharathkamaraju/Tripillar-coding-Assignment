
package Module14;

import java.util.*;

public class program7 {
    // Function to check if the graph is bipartite
    public static boolean isBipartite(int[][] graph, int V) {
        int[] color = new int[V];
        Arrays.fill(color, -1); // -1 means uncolored

        // Check each component of the graph
        for (int start = 0; start < V; start++) {
            if (color[start] == -1) {
                Queue<Integer> q = new LinkedList<>();
                q.add(start);
                color[start] = 0; // Start coloring with 0

                while (!q.isEmpty()) {
                    int node = q.poll();
                    for (int neighbor = 0; neighbor < V; neighbor++) {
                        if (graph[node][neighbor] == 1) { // Edge exists
                            if (color[neighbor] == -1) {
                                // Assign opposite color
                                color[neighbor] = 1 - color[node];
                                q.add(neighbor);
                            } else if (color[neighbor] == color[node]) {
                                // Same color on both sides → not bipartite
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Example graph (Adjacency Matrix)
        // Graph: 0--1, 1--2, 2--3, 3--0 (Cycle of 4 nodes)
        int V = 4;
        int[][] graph = {
                {0, 1, 0, 1},
                {1, 0, 1, 0},
                {0, 1, 0, 1},
                {1, 0, 1, 0}
        };

        if (isBipartite(graph, V)) {
            System.out.println("The graph is Bipartite.");
        } else {
            System.out.println("The graph is NOT Bipartite.");
        }
    }
}