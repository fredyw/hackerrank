package hackerrank.ctci;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/ctci-connected-cell-in-a-grid
 */
public class ConnectedCellInAGrid {
    private static int connectedCell(int[][] grid, int maxRow, int maxCol) {
        boolean[][] marked = new boolean[maxRow][maxCol];
        int max = 0;
        for (int row = 0; row < maxRow; row++) {
            for (int col = 0; col < maxCol; col++) {
                if (grid[row][col] == 1 && !marked[row][col]) {
                    max = Math.max(max, connectedCell(grid, marked, row, col, maxRow, maxCol));
                }
            }
        }
        return max;
    }

    private static int connectedCell(int[][] grid, boolean[][] marked,
                                      int row, int col, int maxRow, int maxCol) {
        if (row < 0 || row >= maxRow || col < 0 || col >= maxCol) {
            return 0;
        }
        if (marked[row][col] || grid[row][col] == 0) {
            return 0;
        }
        int val = 0;
        if (grid[row][col] == 1) {
            val = 1;
        }
        marked[row][col] = true;
        // top
        int a = connectedCell(grid, marked, row - 1, col, maxRow, maxCol);
        // top right
        int b = connectedCell(grid, marked, row - 1, col + 1, maxRow, maxCol);
        // right
        int c = connectedCell(grid, marked, row, col + 1, maxRow, maxCol);
        // bottom right
        int d = connectedCell(grid, marked, row + 1, col + 1, maxRow, maxCol);
        // bottom
        int e = connectedCell(grid, marked, row + 1, col, maxRow, maxCol);
        // bottom left
        int f = connectedCell(grid, marked, row + 1, col - 1, maxRow, maxCol);
        // left
        int g = connectedCell(grid, marked, row, col - 1, maxRow, maxCol);
        // top left
        int h = connectedCell(grid, marked, row - 1, col - 1, maxRow, maxCol);
        return val + a + b + c + d + e + f + g + h;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int grid[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = in.nextInt();
            }
        }
        System.out.println(connectedCell(grid, n, m));
    }
}
