

package Module14;

import java.util.*;

public class program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Number of nodes
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

        // Node whose neighbors we want
        int node = sc.nextInt();

        // Print neighbors
        System.out.println("Neighbors of node " + node + ":");
        for (int neighbor : adj.get(node)) {
            System.out.print(neighbor + " ");
        }
        System.out.println();
    }
}
