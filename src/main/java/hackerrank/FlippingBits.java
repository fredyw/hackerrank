package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/flipping-bits
 */
public class FlippingBits {
    private static long flippingBits(long num) {
        return ~num + 0x0000000100000000L;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for (int t = 0; t < testCases; t++) {
            long num = in.nextLong();
            System.out.println(flippingBits(num));
        }
    }
}
