package hackerrank.ctci;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/ctci-big-o
 */
public class Primality {
    private static String isPrime(int n) {
        if (n == 1) {
            return "Not prime";
        }
        boolean prime = true;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        return (prime) ? "Prime" : "Not prime";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        for (int a0 = 0; a0 < p; a0++) {
            int n = in.nextInt();
            System.out.println(isPrime(n));
        }
    }
}
