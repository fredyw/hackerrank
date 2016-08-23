package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/count-luck
 */
public class CountLuck {
    private static String countLuck(char[][] matrix, int maxRow, int maxCol, int k) {
        int row = 0;
        int col = 0;
        outer:
        for (int i = 0; i < maxRow; i++) {
            for (int j = 0; j < maxCol; j++) {
                if (matrix[i][j] == 'M') {
                    row = i;
                    col = j;
                    break outer;
                }
            }
        }
        boolean[][] marked = new boolean[maxRow][maxCol];
        int count = countLuck(matrix, maxRow, maxCol, row, col, marked, 0);
        return (count == k) ? "Impressed" : "Oops!";
    }

    private static int countLuck(char[][] matrix, int maxRow, int maxCol,
                                 int row, int col, boolean[][] marked, int accu) {
        if (row < 0 || row >= maxRow || col < 0 || col >= maxCol) {
            return 0;
        }
        if (marked[row][col] == true) {
            return 0;
        }
        if (matrix[row][col] == 'X') {
            return 0;
        }
        if (matrix[row][col] == '*') {
            return accu;
        }
        marked[row][col] = true;
        int pathCount = 0;
        // check for multiple paths
        if (row - 1 >= 0 && row - 1 < maxRow &&!marked[row - 1][col] &&
            (matrix[row - 1][col] == '.' || matrix[row - 1][col] == '*')) {
            pathCount++;
        }
        if (row + 1 >= 0 && row + 1 < maxRow && !marked[row + 1][col] &&
            (matrix[row + 1][col] == '.' || matrix[row + 1][col] == '*')) {
            pathCount++;
        }
        if (col - 1 >= 0 && col - 1 < maxCol && !marked[row][col - 1] &&
            (matrix[row][col - 1] == '.' || matrix[row][col - 1] == '*')) {
            pathCount++;
        }
        if (col + 1 >= 0 && col + 1 < maxCol && !marked[row][col + 1] &&
            (matrix[row][col + 1] == '.' || matrix[row][col + 1] == '*')) {
            pathCount++;
        }
        // there are multiple paths
        int count = 0;
        if (pathCount > 1) {
            count++;
        }
        // up
        int a = countLuck(matrix, maxRow, maxCol, row - 1, col, marked, accu + count);
        // down
        int b = countLuck(matrix, maxRow, maxCol, row + 1, col, marked, accu + count);
        // left
        int c = countLuck(matrix, maxRow, maxCol, row, col - 1, marked, accu + count);
        // right
        int d = countLuck(matrix, maxRow, maxCol, row, col + 1, marked, accu + count);
        return Math.max(a, Math.max(b, Math.max(c, d)));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for (int t = 0; t < testCases; t++) {
            int n = in.nextInt();
            int m = in.nextInt();
            char[][] matrix = new char[n][m];
            for (int i = 0; i < n; i++) {
                String str = in.next();
                matrix[i] = str.toCharArray();
            }
            int k = in.nextInt();
            System.out.println(countLuck(matrix, n, m, k));
        }
    }
}
