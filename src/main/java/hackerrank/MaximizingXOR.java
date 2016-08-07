package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/maximizing-xor
 */
public class MaximizingXOR {
    private static int maximizingXOR(int l, int r) {
        int max = 0;
        for (int i = l; i <= r; i++) {
            for (int j = i; j <= r; j++) {
                int a = i ^ j;
                max = Math.max(max, a);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        int r = in.nextInt();
        System.out.println(maximizingXOR(l, r));
    }
}
