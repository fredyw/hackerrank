package hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/cut-the-tree
 */
public class CutTheTree {
    private static class Vertex {
        private final int vertex;
        private final int value;

        public Vertex(int vertex, int value) {
            this.vertex = vertex;
            this.value = value;
        }
    }

    private static int cutTheTree(Map<Integer, List<Vertex>> adjList) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<Integer, Vertex> vertices = new HashMap<>();
        Map<Integer, List<Vertex>> adjList = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            int val = in.nextInt();
            vertices.put(i, new Vertex(i, val));
            adjList.put(i, new ArrayList<>());
        }
        for (int i = 1; i <= n - 1; i++) {
            int from = in.nextInt();
            int to = in.nextInt();
            adjList.get(from).add(vertices.get(to));
        }
    }
}
