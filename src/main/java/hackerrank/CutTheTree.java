package hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * https://www.hackerrank.com/challenges/cut-the-tree
 */
public class CutTheTree {
    private static class Vertex {
        private final int vertex;
        private final int value;
        private int totalValue;

        public Vertex(int vertex, int value) {
            this.vertex = vertex;
            this.value = value;
        }
    }

    private static int cutTheTree(Map<Integer, List<Vertex>> adjList,
                                  Map<Integer, Vertex> vertices,
                                  int totalValue) {
        int min = Integer.MAX_VALUE;
        calcTotalValue(adjList, vertices.get(1), new HashSet<>()); // start from the root
        for (int i = 2; i <= adjList.size(); i++) {
            int a = vertices.get(i).totalValue;
            int b = totalValue - a;
            int diff = Math.abs(a - b);
            min = Math.min(min, diff);
        }
        return min;
    }

    private static int calcTotalValue(Map<Integer, List<Vertex>> adjList, Vertex vertex,
                                      Set<Integer> marked) {
        marked.add(vertex.vertex);
        int totalValue = vertex.value;
        for (Vertex adj : adjList.get(vertex.vertex)) {
            if (!marked.contains(adj.vertex)) {
                totalValue += calcTotalValue(adjList, adj, marked);
            }
        }
        vertex.totalValue = totalValue;
        return totalValue;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<Integer, Vertex> vertices = new HashMap<>();
        Map<Integer, List<Vertex>> adjList = new HashMap<>();
        int totalValue = 0;
        for (int i = 1; i <= n; i++) {
            int val = in.nextInt();
            vertices.put(i, new Vertex(i, val));
            adjList.put(i, new ArrayList<>());
            totalValue += val;
        }
        for (int i = 1; i <= n - 1; i++) {
            int from = in.nextInt();
            int to = in.nextInt();
            adjList.get(from).add(vertices.get(to));
            adjList.get(to).add(vertices.get(from));
        }
        System.out.println(cutTheTree(adjList, vertices, totalValue));
    }
}
