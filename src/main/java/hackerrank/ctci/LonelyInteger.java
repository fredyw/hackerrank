package hackerrank.ctci;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/ctci-lonely-integer
 */
public class LonelyInteger {
    private static int lonelyInteger(int[] a) {
        int n = a[0];
        for (int i = 1; i < a.length; i++) {
            n ^= a[i];
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        System.out.println(lonelyInteger(a));
    }
}
