package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/two-arrays
 */
public class TwoArrays {
    private static String twoArrays(Integer[] a, Integer[] b, int k) {
        Arrays.sort(a);
        Arrays.sort(b, (x, y) -> Integer.compare(y, x));
        for (int i = 0; i < a.length; i++) {
            if (a[i] + b[i] < k) {
                return "NO";
            }
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for (int t = 0; t < testCases; t++) {
            int n = in.nextInt();
            int k = in.nextInt();
            Integer[] a = new Integer[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            Integer[] b = new Integer[n];
            for (int i = 0; i < n; i++) {
                b[i] = in.nextInt();
            }
            System.out.println(twoArrays(a, b, k));
        }
    }
}
