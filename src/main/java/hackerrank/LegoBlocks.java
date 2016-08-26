package hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/lego-blocks
 */
public class LegoBlocks {
    private static long legoBlocks(int n, int m) {
        // TODO
        return solidBlocks(n, m, new HashMap<>()) % 1000000007;
    }

    private static long solidBlocks(int n, int m, Map<String, Long> solidMemo) {
        if (m == 0) {
            return 0;
        }
        String key = n + "|" + m;
        if (solidMemo.containsKey(key)) {
            return solidMemo.get(key);
        }
        Map<Integer, Long> allMemo = new HashMap<>();
        long total = (long) Math.pow(allBlocks(m, allMemo), n);
        for (int i = 1; i <= m - 1; i++) {
            long a = solidBlocks(n, i, solidMemo);
            long b = (long) Math.pow(allBlocks(m - i, allMemo), n);
            long substract = (a * b);
            total -= substract;
        }
        solidMemo.put(key, total);
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
