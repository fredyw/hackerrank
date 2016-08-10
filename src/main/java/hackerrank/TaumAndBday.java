package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/taum-and-bday
 */
public class TaumAndBday {
    private static long taumAndBday(long b, long w, long x, long y, long z) {
        long result = 0;
        if (x <= y) {
            result += x * b;
            if (x + z < y) {
                result += (x + z) * w;
            } else {
                result += y * w;
            }
        } else { // x > y
            result += y * w;
            if (y + z < x) {
                result += (y + z) * b;
            } else {
                result += (x * b);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            long b = in.nextLong();
            long w = in.nextLong();
            long x = in.nextLong();
            long y = in.nextLong();
            long z = in.nextLong();
            System.out.println(taumAndBday(b, w, x, y, z));
        }
    }
}
