package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/stockmax
 */
public class StockMaximize {
    private static long maxProfit(long[] prices) {
        long maxSoFar = 0;
        long profit = 0;
        for (int i = prices.length - 1; i >= 0; i--) {
            maxSoFar = Math.max(prices[i], maxSoFar);
            profit += maxSoFar - prices[i];
        }
        return profit;
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
