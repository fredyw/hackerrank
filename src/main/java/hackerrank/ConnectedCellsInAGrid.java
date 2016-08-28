package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/connected-cell-in-a-grid
 */
public class ConnectedCellsInAGrid {
    private static int connectedCells(int[][] matrix, int maxRow, int maxCol) {
        int max = 0;
        for (int i = 0; i < maxRow; i++) {
            for (int j = 0; j < maxCol; j++) {
                if (matrix[i][j] == 1) {
                    int tmpMax = connectedCells(matrix, maxRow, maxCol, i, j);
                    max = Math.max(max, tmpMax);
                }
            }
        }
        return max;
    }

    private static int connectedCells(int[][] matrix, int maxRow, int maxCol, int row, int col) {
        if (row < 0 || row >= maxRow || col < 0 || col >= maxCol) {
            return 0;
        }
        if (matrix[row][col] == 0) {
            return 0;
        }
        if (matrix[row][col] == 1) {
            matrix[row][col] = 0;
        }
        // up
        int a = connectedCells(matrix, maxRow, maxCol, row - 1, col);
        // upper right
        int b = connectedCells(matrix, maxRow, maxCol, row - 1, col + 1);
        // right
        int c = connectedCells(matrix, maxRow, maxCol, row, col + 1);
        // lower right
        int d = connectedCells(matrix, maxRow, maxCol, row + 1, col + 1);
        // down
        int e = connectedCells(matrix, maxRow, maxCol, row + 1, col);
        // lower left
        int f = connectedCells(matrix, maxRow, maxCol, row + 1, col - 1);
        // left
        int g = connectedCells(matrix, maxRow, maxCol, row, col - 1);
        // upper left
        int h = connectedCells(matrix, maxRow, maxCol, row - 1, col - 1);
        return a + b + c + d + e + f + g + h + 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        System.out.println(connectedCells(matrix, n, m));
    }
}
