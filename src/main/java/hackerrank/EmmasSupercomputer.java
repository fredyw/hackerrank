package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/two-pluses
 */
public class EmmasSupercomputer {
    private static int emmasSupercomputer(char[][] matrix, int maxRow, int maxCol) {
        // TODO:
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        char[][] matrix = new char[n][m];
        for (int i = 0; i < n; i++) {
            matrix[i] = in.next().toCharArray();
        }
        System.out.println(emmasSupercomputer(matrix, n, m));
    }
}
