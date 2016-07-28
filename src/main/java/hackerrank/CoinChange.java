package hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/coin-change
 */
public class CoinChange {
    private static int coinChange(int n, int[] coins) {
        return coinChange(n, coins, new HashMap<>());
    }

    private static int coinChange(int n, int[] coins, Map<Integer, Integer> memo) {
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        int numChange = 0;
        for (int coin : coins) {
            numChange += coinChange(n - coin, coins, memo);
        }
        return numChange;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] coins = new int[m];
        for (int i = 0; i < m; i++) {
            coins[i] = in.nextInt();
        }
        System.out.println(coinChange(n, coins));
    }
}
