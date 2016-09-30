package hackerrank.ctci;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

/**
 * https://www.hackerrank.com/challenges/ctci-bfs-shortest-reach
 */
public class ShortestReachInAGraph {
    public static class Graph {
        private final int size;
        private final Map<Integer, List<Integer>> adjList = new HashMap<>();

        public Graph(int size) {
            this.size = size;
            for (int i = 0; i < size; i++) {
                adjList.put(i, new ArrayList<>());
            }
        }

        public void addEdge(int first, int second) {
            adjList.get(first).add(second);
            adjList.get(second).add(first);
        }

        public int[] shortestReach(int startId) { // 0 indexed
            Map<Integer, Integer> paths = bfs(startId, adjList);
            int[] shortest = new int[size];
            for (int i = 0; i < size; i++) {
                int count = 0;
                Integer p = paths.get(i);
                while (p != null) {
                    p = paths.get(p);
                    count++;
                }
                shortest[i] = (count == 0) ? -1 : count * 6;
            }
            return shortest;
        }

        private static Map<Integer, Integer> bfs(int source, Map<Integer, List<Integer>> adjList) {
            Set<Integer> visited = new HashSet<>();
            Map<Integer, Integer> paths = new HashMap<>();
            Queue<Integer> queue = new LinkedList<>();
            queue.add(source);
            while (!queue.isEmpty()) {
                Integer element = queue.remove();
                visited.add(element);
                for (int adj : adjList.get(element)) {
                    if (!visited.contains(adj)) {
                        paths.put(adj, element);
                        visited.add(adj);
                        queue.add(adj);
                    }
                }
            }
            return paths;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int queries = scanner.nextInt();

        for (int t = 0; t < queries; t++) {
            // Create a graph of size n where each edge weight is 6:
            Graph graph = new Graph(scanner.nextInt());
            int m = scanner.nextInt();

            // read and set edges
            for (int i = 0; i < m; i++) {
                int u = scanner.nextInt() - 1;
                int v = scanner.nextInt() - 1;
                // add each edge to the graph
                graph.addEdge(u, v);
            }

            // Find shortest reach from node s
            int startId = scanner.nextInt() - 1;
            int[] distances = graph.shortestReach(startId);

            for (int i = 0; i < distances.length; i++) {
                if (i != startId) {
                    System.out.print(distances[i]);
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
