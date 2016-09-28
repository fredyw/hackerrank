package hackerrank.ctci;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/ctci-recursive-staircase
 */
public class DavisStaircase {
    private static int staircase(int n) {
        // TODO:
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        for (int a0 = 0; a0 < s; a0++) {
            int n = in.nextInt();
            System.out.println(staircase(n));
        }
    }
}
