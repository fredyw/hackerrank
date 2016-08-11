package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/cavity-map
 */
public class CavityMap {
    private static void cavityMap(char[][] matrix) {
        for (int row = 1; row < matrix.length - 1; row++) {
            for (int col = 1; col < matrix[row].length - 1; col++) {
                int val = matrix[row][col];
                if (matrix[row - 1][col] < val &&
                    matrix[row + 1][col] < val &&
                    matrix[row][col - 1] < val &&
                    matrix[row][col + 1] < val) {
                    matrix[row][col] = 'X';
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(new String(matrix[i]));
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char[][] matrix = new char[n][n];
        for (int i = 0; i < n; i++) {
            String str = in.next();
            matrix[i] = str.toCharArray();
        }
        cavityMap(matrix);
    }
}
