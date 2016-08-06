package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/countingsort3
 */
public class CountingSort3 {
    private static void countingSort(int[] array) {
        int[] nums = new int[100];
        for (int i = 0; i < array.length; i++) {
            nums[array[i]]++;
        }

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                nums[i] = nums[i];
            } else {
                nums[i] = nums[i - 1] + nums[i];
            }
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
            in.next();
        }
        countingSort(array);
    }
}
