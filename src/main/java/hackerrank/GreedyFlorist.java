package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/greedy-florist
 */
public class GreedyFlorist {
    private static long greedyFlorist(long[] costs, int k) {
        Arrays.sort(costs);
        int[] purchases = new int[k];
        for (int i = 0; i < k; i++) {
            purchases[i] = 1;
        }
        int result = 0;
        int personIdx = 0;
        for (int i = costs.length - 1; i >= 0; i--) {
            if (personIdx >= k) {
                personIdx = 0;
            }
            result += purchases[personIdx] * costs[i];
            purchases[personIdx]++;
            personIdx++;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        long[] costs = new long[n];
        for (int i = 0; i < n; i++) {
            costs[i] = in.nextInt();
        }
        System.out.println(greedyFlorist(costs, k));
    }
}
