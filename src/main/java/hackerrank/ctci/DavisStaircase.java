package hackerrank.ctci;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/ctci-recursive-staircase
 */
public class DavisStaircase {
    private static int staircase(int n) {
        return staircase(n, new HashMap<>());
    }

    private static int staircase(int n, Map<Integer, Integer> memo) {
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        int total = 0;
        for (int i = 1; i <= 3; i++) {
            total += staircase(n - i, memo);
        }
        memo.put(n, total);
        return total;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        for (int a0 = 0; a0 < s; a0++) {
            int n = in.nextInt();
            System.out.println(staircase(n));
        }
    }
}
