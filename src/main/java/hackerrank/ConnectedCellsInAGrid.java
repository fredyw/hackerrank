package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/connected-cell-in-a-grid
 */
public class ConnectedCellsInAGrid {
    private static int connectedCells(int[][] matrix) {
        // TODO
        return 0;
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
        System.out.println(connectedCells(matrix));
    }
}
