

package Module14;

import java.util.*;

public class program5 {
    // Depth First Search to mark all reachable vertices
    private static void dfs(int v, boolean[] visited, List<List<Integer>> adj) {
        visited[v] = true;
        for (int u : adj.get(v)) {
            if (!visited[u]) {
                dfs(u, visited, adj);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: number of vertices and edges
        int n = sc.nextInt(); // number of vertices
        int m = sc.nextInt(); // number of edges

        // adjacency list
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        // read edges
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            // assuming 0-based indexing
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        boolean[] visited = new boolean[n];
        int components = 0;

        // count connected components
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i, visited, adj);
                components++;
            }
        }

        System.out.println("Number of connected components: " + components);
        sc.close();
    }

}
