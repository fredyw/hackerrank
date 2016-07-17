package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/compare-the-triplets
 */
public class CompareTheTriplets {
    private static void compare(int a0, int a1, int a2, int b0, int b1, int b2) {
        int sumA = 0;
        int sumB = 0;
        if (a0 > b0) {
            sumA++;
        } else if (a0 < b0) {
            sumB++;
        }
        if (a1 > b1) {
            sumA++;
        } else if (a1 < b1) {
            sumB++;
        }
        if (a2 > b2) {
            sumA++;
        } else if (a2 < b2) {
            sumB++;
        }
        System.out.println(sumA + " " + sumB);
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        compare(a0, a1, a2, b0, b1, b2);
    }
}
