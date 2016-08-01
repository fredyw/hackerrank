package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/sherlock-and-array
 */
public class SherlockAndArray {
    private static String sherlockAndArray(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int sumLeft = 0;
        int sumRight = 0;
        while (i < j) {
            while (i < j && sumLeft < sumRight) {
                sumLeft += nums[i];
                i++;
            }
            while (i < j && sumLeft >= sumRight) {
                sumRight += nums[j];
                j--;
            }
        }
        return (sumLeft == sumRight) ? "YES" : "NO";
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
            System.out.println(sherlockAndArray(nums));
        }
    }
}
