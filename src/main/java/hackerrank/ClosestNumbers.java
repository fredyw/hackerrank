package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/closest-numbers
 */
public class ClosestNumbers {
    private static void closestNumbers(int[] nums) {
        Arrays.sort(nums);
        int[] diffArray = new int[nums.length];
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < nums.length; i++) {
            diffArray[i] = Math.abs(nums[i - 1] - nums[i]);
            min = Math.min(min, diffArray[i]);
        }
        for (int i = 1; i < diffArray.length; i++) {
            if (min == diffArray[i]) {
                System.out.print(nums[i - 1] + " " + nums[i] + " ");
            }
        }
        System.out.println();
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
