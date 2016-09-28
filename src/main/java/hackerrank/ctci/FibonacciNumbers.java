package hackerrank.ctci;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/ctci-fibonacci-numbers
 */
public class FibonacciNumbers {
    private static int fibonacci(int n) {
        return fibonacci(n, new HashMap<>());
    }

    private static int fibonacci(int n, Map<Integer, Integer> memo) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        int val = fibonacci(n - 1, memo) + fibonacci(n - 2, memo);
        memo.put(n, val);
        return val;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(fibonacci(n));
    }
}
