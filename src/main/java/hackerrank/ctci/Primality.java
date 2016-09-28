package hackerrank.ctci;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/ctci-big-o
 */
public class Primality {
    private static String isPrime(int n) {
        // TODO
        return "";
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
