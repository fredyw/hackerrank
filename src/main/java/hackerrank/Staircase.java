package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/staircase
 */
public class Staircase {
    private static void staircase(int n) {
        for (int i = 0, k = n - 1; i < n; i++, k--) {
            for (int j = 0; j < n; j++) {
                if (j >= k) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        staircase(n);
    }
}
