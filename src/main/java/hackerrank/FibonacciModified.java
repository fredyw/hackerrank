package hackerrank;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/fibonacci-modified
 */
public class FibonacciModified {
    private static BigInteger fibonacciModified(int t1, int t2, int n) {
        return fibMod(BigInteger.valueOf(t1), BigInteger.valueOf(t2), n,
            new HashMap<>());
    }

    private static BigInteger fibMod(BigInteger t1, BigInteger t2, int n,
                                     Map<Integer, BigInteger> memo) {
        if (n == 1) {
            return t1;
        }
        if (n == 2) {
            return t2;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        BigInteger a = fibMod(t1, t2, n - 2, memo);
        BigInteger b = fibMod(t1, t2, n - 1, memo);
        BigInteger bSquared = b.multiply(b);
        BigInteger result = a.add(bSquared);
        memo.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t1 = in.nextInt();
        int t2 = in.nextInt();
        int n = in.nextInt();
        System.out.println(fibonacciModified(t1, t2, n));
    }
}
