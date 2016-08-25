package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/lego-blocks
 */
public class LegoBlocks {
    private static int legoBlocks(int n, int m) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for (int t = 0; t < testCases; t++) {
            int n = in.nextInt();
            int m = in.nextInt();
            System.out.println(legoBlocks(n, m));
        }
    }
}
