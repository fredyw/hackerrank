package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/whats-next
 */
public class WhatsNext {
    private static long compress(String num) {
        long x = 0;
        for (int i = 0; i < num.length(); i++) {
            int n = Integer.parseInt("" + num.charAt(i));
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    x <<= 1;
                    x |= 1;
                }
            } else {
                for (int j = 0; j < n; j++) {
                    x <<= 1;
                }
            }
        }
        return x;
    }

    private static void whatsNext(String num) {
        String compressed = Long.toBinaryString(compress(num));
        // TODO
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for (int t = 0; t < testCases; t++) {
            int length = in.nextInt();
            String num = "";
            for (int i = 0; i < length; i++) {
                num += in.next();
            }
            whatsNext(num);
        }
    }
}
