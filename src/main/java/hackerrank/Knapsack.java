package hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/unbounded-knapsack
 */
public class Knapsack {
    private static int knapsack(int[] nums, int k) {
        return knapsack(nums, k, 0, new HashMap<>());
    }

    private static int knapsack(int[] nums, int k, int prev, Map<String, Integer> memo) {
        String key = k + "|" + prev;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int nextK = k - nums[i];
            if (k - nums[i] == 0) {
                max = Math.max(max, nums[i] + prev);
            } else if (k - nums[i] < 0) {
                max = Math.max(max, prev);
            } else {
                max = Math.max(max, knapsack(nums, nextK, nums[i], memo) + prev);
            }
        }
        memo.put(key, max);
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for (int t = 0; t < testCases; t++) {
            int n = in.nextInt();
            int k = in.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = in.nextInt();
            }
            System.out.println(knapsack(nums, k));
        }
    }
}
