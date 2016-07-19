package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/equal-stacks
 */
public class EqualsStack {
    private static int min(int totalH1, int totalH2, int totalH3) {
        return Math.min(totalH1, Math.min(totalH2, totalH3));
    }

    private static int equalsStack(int[] h1, int totalH1,
                                   int[] h2, int totalH2,
                                   int[] h3, int totalH3) {
        int h1Idx = 0;
        int h2Idx = 0;
        int h3Idx = 0;
        int min = min(totalH1, totalH2, totalH3);
        while (!(totalH1 == totalH2 && totalH2 == totalH3)) {
            while (totalH1 > min && h1Idx < h1.length) {
                totalH1 -= h1[h1Idx];
                h1Idx++;
            }
            while (totalH2 > min && h2Idx < h2.length) {
                totalH2 -= h2[h2Idx];
                h2Idx++;
            }
            while (totalH3 > min && h3Idx < h3.length) {
                totalH3 -= h3[h3Idx];
                h3Idx++;
            }
            min = min(totalH1, totalH2, totalH3);
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int h1[] = new int[n1];
        int totalH1 = 0;
        for (int h1_i = 0; h1_i < n1; h1_i++) {
            int h = in.nextInt();
            h1[h1_i] = h;
            totalH1 += h;
        }
        int h2[] = new int[n2];
        int totalH2 = 0;
        for (int h2_i = 0; h2_i < n2; h2_i++) {
            int h = in.nextInt();
            h2[h2_i] = h;
            totalH2 += h;
        }
        int h3[] = new int[n3];
        int totalH3 = 0;
        for (int h3_i = 0; h3_i < n3; h3_i++) {
            int h = in.nextInt();
            h3[h3_i] = h;
            totalH3 += h;
        }
        System.out.println(equalsStack(h1, totalH1, h2, totalH2, h3, totalH3));
    }
}
