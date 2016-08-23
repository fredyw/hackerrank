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
        int expensiveIdx = costs.length - 1;
        int cheapIdx = 0;
        int result = 0;
        int personIdx = 0;
        boolean buyExpensive = true;
        while (cheapIdx <= expensiveIdx) {
            if (personIdx >= k) {
                personIdx = 0;
                buyExpensive = !buyExpensive;
            }
            if (buyExpensive) {
                System.out.println(expensiveIdx);
                result += purchases[personIdx] * costs[expensiveIdx];
                expensiveIdx--;
            } else {
                System.out.println(cheapIdx);
                result += purchases[personIdx] * costs[cheapIdx];
                cheapIdx++;
            }
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
