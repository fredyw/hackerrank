package hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/primsmstsub
 */
public class PrimsSpecialSubtree {
    private static int mst(Map<Integer, List<Edge>> adjList, int start) {
        // TODO
        return 0;
    }

    private static class Edge {
        private final int v1;
        private final int v2;
        private final int weight;

        public Edge(int v1, int v2, int weight) {
            this.v1 = v1;
            this.v2 = v2;
            this.weight = weight;
        }

        public int either(int v) {
            return v1;
        }

        public int other(int v) {
            if (v == v1) {
                return v2;
            }
            return v1;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        Map<Integer, List<Edge>> adjList = new HashMap<>();
        for (int vertex = 0; vertex < n; vertex++) {
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
