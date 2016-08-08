package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/sherlock-and-squares
 */
public class SherlockAndSquares {
    private static int sherlockAndSquares(int a, int b) {
        int sqrtA = (int) Math.ceil(Math.sqrt(a));
        int sqrtB = (int) Math.floor(Math.sqrt(b));
        return sqrtB - sqrtA + 1;
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
