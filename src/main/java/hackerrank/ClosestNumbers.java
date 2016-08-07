package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/closest-numbers
 */
public class ClosestNumbers {
    private static void closestNumbers(int[] nums) {
        // TODO
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        closestNumbers(nums);
    }
}
