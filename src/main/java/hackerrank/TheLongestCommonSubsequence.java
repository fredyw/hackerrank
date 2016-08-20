package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/dynamic-programming-classics-the-longest-common-subsequence
 */
public class TheLongestCommonSubsequence {
    private static void longestCommonSubsequence(int[] array1, int[] array2) {
        // TODO
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] array1 = new int[n];
        for (int i = 0; i < n; i++) {
            array1[i] = in.nextInt();
        }
        int[] array2 = new int[m];
        for (int i = 0; i < m; i++) {
            array2[i] = in.nextInt();
        }
        longestCommonSubsequence(array1, array2);
    }
}
