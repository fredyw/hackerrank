package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/largest-permutation
 */
public class LargestPermutation {
    private static void largestPermutation(int[] a) {
        // TODO:
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        largestPermutation(a);
    }
}
