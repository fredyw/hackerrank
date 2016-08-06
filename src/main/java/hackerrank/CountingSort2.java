package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/countingsort2
 */
public class CountingSort2 {
    private static void countingSort(int[] array) {
        int[] nums = new int[100];
        for (int i = 0; i < array.length; i++) {
            nums[array[i]]++;
        }
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < nums[i]; j++) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        countingSort(array);
    }
}
