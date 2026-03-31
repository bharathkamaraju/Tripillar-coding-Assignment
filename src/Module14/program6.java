

package Module14;

import java.util.*;

public class program6 {
    // Function to perform BFS and find shortest path
    public static void bfsShortestPath(Map<Integer, List<Integer>> graph, int start, int end) {
        Queue<Integer> queue = new LinkedList<>();
        Map<Integer, Integer> parent = new HashMap<>();
        Set<Integer> visited = new HashSet<>();

        queue.add(start);
        visited.add(start);
        parent.put(start, -1); // start node has no parent

        while (!queue.isEmpty()) {
            int current = queue.poll();

            if (current == end) {
                break; // reached destination
            }

            for (int neighbor : graph.getOrDefault(current, new ArrayList<>())) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                    parent.put(neighbor, current);
                }
            }
        }

        // Reconstruct shortest path
        if (!parent.containsKey(end)) {
            System.out.println("No path exists from " + start + " to " + end);
            return;
        }

        List<Integer> path = new ArrayList<>();
        for (int at = end; at != -1; at = parent.get(at)) {
            path.add(at);
        }
        Collections.reverse(path);

        System.out.println("Shortest path from " + start + " to " + end + ": " + path);
    }

    public static void main(String[] args) {
        // Example graph (undirected)
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(1, 2));
        graph.put(1, Arrays.asList(0, 3));
        graph.put(2, Arrays.asList(0, 3));
        graph.put(3, Arrays.asList(1, 2, 4));
        graph.put(4, Arrays.asList(3, 5));
        graph.put(5, Arrays.asList(4));

        int start = 0;
        int end = 5;

        bfsShortestPath(graph, start, end);
    }
}
