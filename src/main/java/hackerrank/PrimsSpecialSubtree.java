package hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

/**
 * https://www.hackerrank.com/challenges/primsmstsub
 */
public class PrimsSpecialSubtree {
    private static int mst(Map<Integer, List<Edge>> adjList, int source) {
        PriorityQueue<Edge> queue = new PriorityQueue<>();
        Set<Integer> marked = new HashSet<>();
        List<Edge> mst = new ArrayList<>();
        visit(adjList, source, marked, queue);
        while (!queue.isEmpty()) {
            Edge edge = queue.remove();
            int v1 = edge.either();
            int v2 = edge.other(v1);
            if (marked.contains(v1) && marked.contains(v2)) {
                continue;
            }
            mst.add(edge);
            if (!marked.contains(v1)) {
                visit(adjList, v1, marked, queue);
            }
            if (!marked.contains(v2)) {
                visit(adjList, v2, marked, queue);
            }
        }
        int totalWeight = 0;
        for (Edge edge : mst) {
            totalWeight += edge.weight;
        }
        return totalWeight;
    }

    private static void visit(Map<Integer, List<Edge>> adjList, int source,
                              Set<Integer> marked, PriorityQueue<Edge> queue) {
        marked.add(source);
        for (Edge edge : adjList.get(source)) {
            if (!marked.contains(edge.other(source))) {
                queue.add(edge);
            }
        }
    }

    private static class Edge implements Comparable<Edge> {
        private final int v1;
        private final int v2;
        private final int weight;

        public Edge(int v1, int v2, int weight) {
            this.v1 = v1;
            this.v2 = v2;
            this.weight = weight;
        }

        public int either() {
            return v1;
        }

        public int other(int v) {
            if (v == v1) {
                return v2;
            }
            return v1;
        }

        @Override
        public int compareTo(Edge o) {
            return Integer.compare(weight, o.weight);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        Map<Integer, List<Edge>> adjList = new HashMap<>();
        for (int vertex = 1; vertex <= n; vertex++) {
            adjList.put(vertex, new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            int r = in.nextInt();
            adjList.get(x).add(new Edge(x, y, r));
            adjList.get(y).add(new Edge(x, y, r));
        }
        int s = in.nextInt();
        System.out.println(mst(adjList, s));
    }
}
