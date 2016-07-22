package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/tutorial-intro
 */
public class IntroToTutorialChallenges {
    private static int binarySearch(int[] nums, int v) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == v) {
                return mid;
            }
            if (nums[mid] < v) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int v = in.nextInt();
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        System.out.println(binarySearch(nums, v));
    }
}
