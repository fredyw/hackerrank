package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/diagonal-difference
 */
public class DiagonalDifference {
    private static void sumDiff(int[][] matrix, int n) {
        int sum1 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += matrix[i][i];
        }
        int sum2 = 0;
        for (int i = 0, j = n - 1; i < n; i++, j--) {
            sum2 += matrix[i][j];
        }
        System.out.println(Math.abs(sum1 - sum2));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        sumDiff(matrix, n);
    }
}
