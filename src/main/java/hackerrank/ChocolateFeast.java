package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/chocolate-feast
 */
public class ChocolateFeast {
    private static int chocolateFeast(int n, int c, int m) {
        int chocolates = n / c;
        int wrappers = chocolates;
        while (wrappers / m > 0) {
            int unusedWrappers = wrappers % m;
            int newChocolates = wrappers / m;
            chocolates += newChocolates;
            wrappers = newChocolates + unusedWrappers;
        }
        return chocolates;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for (int t = 0; t < testCases; t++) {
            int n = in.nextInt();
            int c = in.nextInt();
            int m = in.nextInt();
            System.out.println(chocolateFeast(n, c, m));
        }
    }
}
