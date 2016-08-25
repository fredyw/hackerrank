package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/lego-blocks
 */
public class LegoBlocks {
    private static long legoBlocks(int n, int m) {
        long total = (long) Math.pow(combinations(m), n);
        System.out.println("total: " + total);
        for (int i = 1; i <= m - 1; i++) {
            long substract = (long) Math.pow(combinations(i), n);
            System.out.println("substract: " + substract);
            total -= substract;
        }
        // TODO
        return total;
    }

    private static long combinations(int width) {
        if (width < 0) {
            return 0;
        }
        if (width == 0) {
            return 1;
        }
        long max = 0;
        for (int i = 1; i <= 4; i++) {
            max += combinations(width - i);
        }
        return max;
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
