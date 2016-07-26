package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/grid-challenge
 */
public class GridChallenge {
    private static boolean gridChallenge(char[][] chars) {
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars[i].length; j++) {
                Arrays.sort(chars[i]);
            }
        }
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars[i].length - 1; j++) {
                if (chars[j][i] > chars[j + 1][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for (int t = 0; t < testCases; t++) {
            int n = in.nextInt();
            char[][] chars = new char[n][n];
            for (int i = 0; i < n; i++) {
                chars[i] = in.next().toCharArray();
            }
            System.out.println(gridChallenge(chars) ? "YES" : "NO");
        }
    }
}
