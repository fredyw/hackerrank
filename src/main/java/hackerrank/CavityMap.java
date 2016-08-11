package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/cavity-map
 */
public class CavityMap {
    private static void cavityMap(char[][] matrix) {
        // TODO
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
