package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/manasa-and-stones
 */
public class ManasaAndStones {
    private static void manasaAndStones(int n, int a, int b) {
        int min = Math.min(a, b) * (n - 1);
        int max = Math.max(a, b) * (n - 1);
        int step = Math.max(a, b) - Math.min(a, b);
        for (int i = min; i < max; i += step) {
            System.out.print(i + " ");
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for (int t = 0; t < testCases; t++) {
            int n = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();
            manasaAndStones(n, a, b);
        }
    }
}
