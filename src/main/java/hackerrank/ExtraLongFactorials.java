package hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/extra-long-factorials
 */
public class ExtraLongFactorials {
    private static BigInteger factorial(int n) {
        if (n == 1 || n == 2) {
            return BigInteger.valueOf(n);
        }
        return factorial(n - 1).multiply(BigInteger.valueOf(n));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(factorial(n));
    }
}
