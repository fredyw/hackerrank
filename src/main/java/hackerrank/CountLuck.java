package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/count-luck
 */
public class CountLuck {
    private static String countLuck(String[][] matrix, int n, int m, int k) {
        // TODO
        return "";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for (int t = 0; t < testCases; t++) {
            int n = in.nextInt();
            int m = in.nextInt();
            String[][] matrix = new String[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = in.next();
                }
            }
            int k = in.nextInt();
            System.out.println(countLuck(matrix, n, m, k));
        }
    }
}
