package hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/red-john-is-back
 */
public class RedJohnIsBack {
    private static int redJohnIsBack(int n) {
        int x = redJohnIsBack(n, new HashMap<>());
        return primes(x);
    }

    private static int primes(int n) {
        boolean[] primes = new boolean[n + 1];
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (primes[i]) {
                continue;
            }
            count++;
            int j = i;
            while (j <= n) {
                primes[j] = true;
                j += i;
            }
        }
        return count;
    }

    private static int redJohnIsBack(int n, Map<Integer, Integer> memo) {
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        int a = redJohnIsBack(n - 1, memo);
        int b = redJohnIsBack(n - 4, memo);
        int total = a + b;
        memo.put(n, total);
        return total;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for (int t = 0; t < testCases; t++) {
            int n = in.nextInt();
            System.out.println(redJohnIsBack(n));
        }
    }
}
