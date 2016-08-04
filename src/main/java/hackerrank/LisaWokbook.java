package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/lisa-workbook
 */
public class LisaWokbook {
    private static int lisaWorkbook(int[] t, int k) {
        int result = 0;
        int page = 1;
        for (int i = 0; i < t.length; i++) {
            int nPages = (int) Math.ceil((double) t[i] / (double) k);
            int prob = 1;
            int toPage = page + nPages - 1;
            for (; page <= toPage; page++) {
                int to = prob + (k - 1);
                for (; prob <= to && prob <= t[i]; prob++) {
                    if (prob == page) {
                        result++;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] t = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = in.nextInt();
        }
        System.out.println(lisaWorkbook(t, k));
    }
}
