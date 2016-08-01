package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/lonely-integer
 */
public class LonelyInteger {
    private static int lonelyInteger(int[] a) {
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            result ^= a[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        System.out.println(lonelyInteger(a));
    }
}
