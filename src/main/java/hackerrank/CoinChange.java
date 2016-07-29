package hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/coin-change
 */
public class CoinChange {
    private static long coinChange(long n, long[] coins) {
        return coinChange(n, coins, new HashMap<>(), 0);
    }

    private static long coinChange(long n, long[] coins, Map<String, Long> memo,
                                   long prev) {
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        String key = n + "|" + prev;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        long numChange = 0;
        for (long coin : coins) {
            if (prev > coin) {
                continue;
            }
            numChange += coinChange(n - coin, coins, memo, coin);
        }
        memo.put(key, numChange);
        return numChange;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        int m = in.nextInt();
        long[] coins = new long[m];
        for (int i = 0; i < m; i++) {
            coins[i] = in.nextInt();
        }
        Arrays.sort(coins);
        System.out.println(coinChange(n, coins));
    }
}
