package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/angry-children
 */
public class MaxMin {
    private static int maxMin(int[] array, int k) {
        Arrays.sort(array);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (i + k - 1 >= array.length) {
                break;
            }
            min = Math.min(min, array[i + k - 1] - array[i]);
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        System.out.println(maxMin(array, k));
    }
}
