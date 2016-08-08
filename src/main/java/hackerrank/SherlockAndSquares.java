package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/sherlock-and-squares
 */
public class SherlockAndSquares {
    private static int sherlockAndSquares(int a, int b) {
        int result = 0;
        // TODO
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for (int t = 0; t < testCases; t++) {
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(sherlockAndSquares(a, b));
        }
    }
}
