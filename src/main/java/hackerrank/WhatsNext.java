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

    private static void decompress(long num) {
        int length = 0;
        int count = 1;
        long oneOrZero = (num & 1);
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            num >>= 1;
            if ((num & 1) == oneOrZero) {
                count++;
            } else {
                sb.append(count).append(' ');
                length++;
                oneOrZero = (oneOrZero == 1) ? 0 : 1;
                count = 1;
            }
        }
        System.out.println(length);
        System.out.println(sb.reverse().substring(1));
    }

    private static void whatsNext(String num) {
        long compressed = compress(num);
        long result = compressed;
        int left = 0;
        while ((result & 1) == 0) {
            result >>= 1;
            left++;
        }
        int right = left;
        while ((result & 1) == 1) {
            result >>= 1;
            right++;
        }
        result <<= right;
        result |= 1 << right;
        long val = 0;
        for (int i = 0; i < right - left - 1; i++) {
            val <<= 1;
            val |= 1;
        }
        result |= val;
        decompress(result);
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
