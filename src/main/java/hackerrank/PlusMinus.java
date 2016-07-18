package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/plus-minus
 */
public class PlusMinus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int nPositive = 0;
        int nNegative = 0;
        int nZero = 0;
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            if (a < 0) {
                nNegative++;
            } else if (a == 0) {
                nZero++;
            } else {
                nPositive++;
            }
        }
        double a = (double) nPositive / n;
        System.out.printf("%.6f\n", a);
        double b = (double) nNegative / n;
        System.out.printf("%.6f\n", b);
        double c = (double) nZero / n;
        System.out.printf("%.6f\n", c);
    }
}
