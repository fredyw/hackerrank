package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/2d-array
 */
public class TwoDArrayDS {
    private static int hourglass(int[][] array) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < 6; row++) {
            for (int col = 0; col < 6; col++) {
                // top
                Integer a = getValue(array, row - 1, col);
                if (a == null) {
                    continue;
                }
                // top right
                Integer b = getValue(array, row - 1, col + 1);
                if (b == null) {
                    continue;
                }
                // center
                Integer c = getValue(array, row, col);
                if (c == null) {
                    continue;
                }
                // bottom right
                Integer d = getValue(array, row + 1, col + 1);
                if (d == null) {
                    continue;
                }
                // bottom
                Integer e = getValue(array, row + 1, col);
                if (e == null) {
                    continue;
                }
                // bottom left
                Integer f = getValue(array, row + 1, col - 1);
                if (f == null) {
                    continue;
                }
                // top left
                Integer g = getValue(array, row - 1, col - 1);
                if (g == null) {
                    continue;
                }
                int sum = a + b + c + d + e + f + g;
                max = Math.max(max, sum);
            }
        }
        return max;
    }

    private static Integer getValue(int[][] array, int row, int col) {
        if (row < 0 || row >= 6 || col < 0 || col >= 6) {
            return null;
        }
        return array[row][col];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] array = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                array[i][j] = in.nextInt();
            }
        }
        System.out.println(hourglass(array));
    }
}
