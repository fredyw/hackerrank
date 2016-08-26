package hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/lego-blocks
 */
public class LegoBlocks {
    private static long legoBlocks(int n, int m) {
        Map<Integer, Long> memo = new HashMap<>();
        long total = (long) Math.pow(allBlocks(m, memo), n);
        System.out.println("total: " + total);
        for (int i = 1; i <= m - 1; i++) {
            long a = (long) Math.pow(allBlocks(i, memo), n);
//            System.out.println("a: " + a);
            long b = (long) Math.pow(allBlocks(m - i, memo), n);
//            System.out.println("b: " + b);
            long substract = a * b;
//            System.out.println("substract (" + i + " and " + (m - i) + "): " + substract);
            total -= substract;
        }
        // TODO
        return total;
    }

    private static long allBlocks(int width, Map<Integer, Long> memo) {
        if (width < 0) {
            return 0;
        }
        if (width == 0) {
            return 1;
        }
        if (memo.containsKey(width)) {
            return memo.get(width);
        }
        long max = 0;
        for (int i = 1; i <= 4; i++) {
            max += allBlocks(width - i, memo);
        }
        memo.put(width, max);
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
