package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/maxsubarray
 */
public class TheMaximumSubarray {
    private static void maxSubarray(int[] nums) {
        int nonContiguous = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nonContiguous = Math.max(nonContiguous, nonContiguous + nums[i]);
        }
        System.out.println(contiguousMaxSubarray(nums) + " " + nonContiguous);
    }

    private static int contiguousMaxSubarray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int max = nums[0];
        int maxSoFar = nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxSoFar = Math.max(nums[i], maxSoFar + nums[i]);
            max = Math.max(max, maxSoFar);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for (int t = 0; t < testCases; t++) {
            int n = in.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = in.nextInt();
            }
            maxSubarray(nums);
        }
    }
}
