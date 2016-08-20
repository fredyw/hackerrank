package hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

/**
 * https://www.hackerrank.com/challenges/even-tree
 */
public class EvenTree {
    private static class Node {
        int value;
        int count;

        private Node(int value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return value == node.value;
        }

        @Override
        public int hashCode() {
            return Objects.hash(value);
        }
    }

    private static int evenTree(Node root, Map<Integer, Node> vertices,
                                Map<Integer, List<Integer>> adjList) {
        int count = 0;
        updateCounts(root, vertices, adjList);
        Queue<Integer> queue = new LinkedList<>();
        queue.add(root.value);
        while (!queue.isEmpty()) {
            int node = queue.remove();
            for (int adj : adjList.get(node)) {
                if (vertices.get(adj).count % 2 == 0) {
                    count++;
                }
                queue.add(adj);
            }
        }
        return count;
    }

    private static int updateCounts(Node root, Map<Integer, Node> vertices,
                                    Map<Integer, List<Integer>> adjList) {
        if (root == null) {
            return 0;
        }
        int count = 1;
        for (int adj : adjList.get(root.value)) {
            count += updateCounts(vertices.get(adj), vertices, adjList);
        }
        root.count = count;
        return root.count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        Map<Integer, Node> vertices = new HashMap<>();
        Map<Integer, List<Integer>> adjList = new HashMap<>();
        Set<Integer> nodes = new HashSet<>();
        for (int vertex = 1; vertex <= n; vertex++) {
            adjList.put(vertex, new ArrayList<>());
            vertices.put(vertex, new Node(vertex));
            nodes.add(vertex);
        }
        for (int edge = 0; edge < m; edge++) {
            int v1 = in.nextInt();
            int v2 = in.nextInt();
            nodes.remove(v1);
            adjList.get(v2).add(vertices.get(v1).value);
        }
        Node root = vertices.get(nodes.iterator().next());
        System.out.println(evenTree(root, vertices, adjList));
    }
}
