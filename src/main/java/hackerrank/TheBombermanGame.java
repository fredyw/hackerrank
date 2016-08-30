package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/bomber-man
 */
public class TheBombermanGame {
    private static void bomberman(char[][] matrix, int maxRow, int maxCol, int seconds) {
        // TODO
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
