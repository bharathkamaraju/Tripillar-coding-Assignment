

package Module14;

import java.util.*;

public class program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Number of vertices
        int n = sc.nextInt();
        // Number of edges
        int e = sc.nextInt();

        // Adjacency list representation
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        // Input edges
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            // Assuming undirected graph
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        // Starting node
        int start = sc.nextInt();

        // BFS traversal
        boolean[] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        visited[start] = true;
        q.add(start);

        System.out.println("Graph traversal starting from node " + start + ":");
        while (!q.isEmpty()) {
            int node = q.poll();
            System.out.print(node + " ");
            for (int neighbor : adj.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    q.add(neighbor);
                }
            }
        }
        System.out.println();
    }
}
