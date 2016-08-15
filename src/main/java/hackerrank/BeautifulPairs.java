package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/beautiful-pairs
 */
public class BeautifulPairs {
    private static int beautifulParis(int[] a, int[] b) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = in.nextInt();
        }
        System.out.println(beautifulParis(a, b));
    }
}
