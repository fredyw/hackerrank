package hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/stockmax
 */
public class StockMaximize {
    private static long maxProfit(long[] prices) {
        return maxProfit(prices, 0, 0, new HashMap<>());
    }

    private static long maxProfit(long[] prices, int day, long shares, Map<String, Long> memo) {
        if (day == prices.length) {
            return 0;
        }
        String key = day + "|" + shares;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        long buy = maxProfit(prices, day + 1, shares + 1, memo) - prices[day];
        long skip = maxProfit(prices, day + 1, shares, memo);
        long sell = maxProfit(prices, day + 1, 0, memo) + (shares * prices[day]);
        long max = Math.max(buy, Math.max(sell, skip));
        memo.put(key, max);
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for (int t = 0; t < testCases; t++) {
            int n = in.nextInt();
            long[] prices = new long[n];
            for (int i = 0; i < n; i++) {
                prices[i] = in.nextLong();
            }
            System.out.println(maxProfit(prices));
        }
    }
}
