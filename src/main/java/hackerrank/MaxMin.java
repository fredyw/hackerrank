package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/angry-children
 */
public class MaxMin {
    private static int maxMin(int[] array, int k) {
        // TODO
        return 0;
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
