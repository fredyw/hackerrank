package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/fair-rations
 */
public class FairRations {
    private static void fairRations(int[] array) {
        // TODO
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        fairRations(array);
    }
}
