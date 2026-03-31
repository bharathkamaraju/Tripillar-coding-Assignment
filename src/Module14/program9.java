

package Module14;

import java.util.*;

public class program9 {
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

        // Print counts
        System.out.println("Number of vertices: " + n);
        System.out.println("Number of edges: " + e);
    }
}
