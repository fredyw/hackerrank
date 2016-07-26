package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * https://www.hackerrank.com/challenges/the-quickest-way-up
 */
public class SnakesAndLadders {
    private static class Graph {
        private final Map<Integer, List<Integer>> adjList = new HashMap<>();

        private void add(int from, int to) {
            if (adjList.containsKey(from)) {
                adjList.get(from).add(to);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(to);
                adjList.put(from, list);
            }
            if (!adjList.containsKey(to)) {
                adjList.put(to, new ArrayList<>());
            }
        }

        private List<Integer> adjacent(int node) {
            if (adjList.containsKey(node)) {
                return adjList.get(node);
            }
            return Collections.emptyList();
        }
    }

    private static int snakesAndLadders(Graph graph, Map<Integer, Integer> snakesOrLadders) {
        Map<Integer, Integer> paths = shortestPath(graph);
        List<Integer> shortestPath = new ArrayList<>();
        int target = 100;
        shortestPath.add(target);
        Integer node = paths.get(target); // target
        while (node != null) {
            shortestPath.add(node);
            node = paths.get(node);
        }
        Collections.reverse(shortestPath);
        if (shortestPath.size() == 1) {
            return -1;
        }

        int count = 0;
        for (int i = 0; i < shortestPath.size() - 1; i++) {
            Integer current = shortestPath.get(i);
            Integer next = shortestPath.get(i + 1);
            if (snakesOrLadders.containsKey(current)) {
                if (snakesOrLadders.get(current) == next) {
                    continue;
                }
            }
            count++;
        }
        return count;
    }

    private static Map<Integer, Integer> shortestPath(Graph graph) {
        Set<Integer> marked = new HashSet<>();
        // child --> parent
        Map<Integer, Integer> paths = new HashMap<>();
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(1); // start from 1
        while (!queue.isEmpty()) {
            Integer node = queue.remove();
            marked.add(node);
            for (int adj : graph.adjacent(node)) {
                if (!marked.contains(adj)) {
                    queue.add(adj);
                    marked.add(adj);
                    paths.put(adj, node);
                }
            }
        }
        return paths;
    }

    private static void buildGraph(Graph graph, Set<Integer> skipNodes) {
        // 10 x 10
        for (int i = 1; i <= 100; i++) {
            if (skipNodes.contains(i)) {
                continue;
            }
            // number of die
            for (int j = 1; j <= 6; j++) {
                if (i + j > 100) {
                    break;
                }
                graph.add(i, i + j);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for (int t = 0; t < testCases; t++) {
            Graph graph = new Graph();
            int n = in.nextInt();
            Set<Integer> fromNodes = new HashSet<>();
            Map<Integer, Integer> snakesOrLadders = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int from = in.nextInt();
                int to = in.nextInt();
                fromNodes.add(from);
                snakesOrLadders.put(from, to);
                graph.add(from, to);
            }
            int m = in.nextInt();
            for (int i = 0; i < m; i++) {
                int from = in.nextInt();
                int to = in.nextInt();
                fromNodes.add(from);
                snakesOrLadders.put(from, to);
                graph.add(from, to);
            }
            buildGraph(graph, fromNodes);
            System.out.println(snakesAndLadders(graph, snakesOrLadders));
        }
    }
}
