package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/bomber-man
 */
public class TheBombermanGame {
    private static class RowCol {
        private final int row;
        private final int col;

        public RowCol(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    private static void bomberman(char[][] matrix, int maxRow, int maxCol, int seconds) {
        if (seconds != 1) {
            int shortSeconds = seconds % 4;
            if (shortSeconds % 2 == 0) {
                for (int row = 0; row < maxRow; row++) {
                    for (int col = 0; col < maxCol; col++) {
                        matrix[row][col] = 'O';
                    }
                }
            } else if (shortSeconds == 3) {
                addAndDetonate(matrix, maxRow, maxCol);
            } else {
                addAndDetonate(matrix, maxRow, maxCol);
                addAndDetonate(matrix, maxRow, maxCol);
            }
        }
        for (int row = 0; row < maxRow; row++) {
            for (int col = 0; col < maxCol; col++) {
                System.out.print(matrix[row][col] + "");
            }
            System.out.println();
        }
    }

    private static void addAndDetonate(char[][] matrix, int maxRow, int maxCol) {
        List<RowCol> rowCols = new ArrayList<>();
        for (int row = 0; row < maxRow; row++) {
            for (int col = 0; col < maxCol; col++) {
                if (matrix[row][col] == 'O') {
                    rowCols.add(new RowCol(row, col));
                }
                matrix[row][col] = 'O';
            }
        }
        for (RowCol rowCol : rowCols) {
            matrix[rowCol.row][rowCol.col] = '.';
            // up
            if (rowCol.row - 1 >= 0) {
                matrix[rowCol.row - 1][rowCol.col] = '.';
            }
            // left
            if (rowCol.col - 1 >= 0) {
                matrix[rowCol.row][rowCol.col - 1] = '.';
            }
            // down
            if (rowCol.row + 1 < maxRow) {
                matrix[rowCol.row + 1][rowCol.col] = '.';
            }
            // right
            if (rowCol.col + 1 < maxCol) {
                matrix[rowCol.row][rowCol.col + 1] = '.';
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        int c = in.nextInt();
        int n = in.nextInt();
        char[][] matrix = new char[r][c];
        for (int i = 0; i < r; i++) {
            matrix[i] = in.next().toCharArray();
        }
        bomberman(matrix, r, c, n);
    }
}
