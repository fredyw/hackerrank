package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/greedy-florist
 */
public class GreedyFlorist {
    private static int greedyFlorist(int[] costs, int k) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] costs = new int[n];
        for (int i = 0; i < n; i++) {
            costs[i] = in.nextInt();
        }
        System.out.println(greedyFlorist(costs, k));
    }
}
