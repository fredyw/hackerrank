package hackerrank;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

/**
 * https://www.hackerrank.com/challenges/bfsshortreach
 */
public class BreadthFirstSearchShortestReach {
    private static void bfs(int source, int vertices, Map<Integer, Set<Integer>> adjList) {
        Map<Integer, Integer> paths = new HashMap<>();
        Set<Integer> marked = new HashSet<>();
        marked.add(source);
        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        while (!queue.isEmpty()) {
            int vertex = queue.remove();
            for (int adj : adjList.get(vertex)) {
                if (!marked.contains(adj)) {
                    paths.put(adj, vertex);
                    queue.add(adj);
                    marked.add(adj);
                }
            }
        }
        for (int vertex = 1; vertex <= vertices; vertex++) {
            if (vertex == source) {
                continue;
            }
            int distance = 0;
            Integer parent = paths.get(vertex);
            while (parent != null) {
                distance += 6;
                parent = paths.get(parent);
            }
            if (distance == 0) {
                System.out.print("-1 ");
            } else {
                System.out.print(distance + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        Map<Integer, Set<Integer>> adjList = new HashMap<>();
        for (int i = 0; i < q; i++) {
            int n = in.nextInt();
            int m = in.nextInt();
            for (int v = 1; v <= n; v++) {
                adjList.put(v, new HashSet<>());
            }
            for (int e = 0; e < m; e++) {
                int v1 = in.nextInt();
                int v2 = in.nextInt();
                adjList.get(v1).add(v2);
                adjList.get(v2).add(v1);
            }
            int s = in.nextInt();
            bfs(s, n, adjList);
        }
    }
}
