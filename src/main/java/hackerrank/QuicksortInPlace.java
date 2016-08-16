package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/quicksort3
 */
public class QuicksortInPlace {
    private static void quicksort(int[] array) {
        // TODO
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        quicksort(array);
    }
}
