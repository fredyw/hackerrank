package hackerrank.ctci;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/ctci-coin-change
 */
public class CoinChange {
    private static long coinChange(int[] coins, int n) {
        return coinChange(coins, n, 0, new HashMap<>());
    }

    private static long coinChange(int[] coins, int n, int prev, Map<String, Long> memo) {
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
        long total = 0;
        for (int i = 0; i < coins.length; i++) {
            if (prev > coins[i]) {
                continue;
            }
            total += coinChange(coins, n - coins[i], coins[i], memo);
        }
        memo.put(key, total);
        return total;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int coins[] = new int[m];
        for (int coins_i = 0; coins_i < m; coins_i++) {
            coins[coins_i] = in.nextInt();
        }
        System.out.println(coinChange(coins, n));
    }
}
