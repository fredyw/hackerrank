package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/bigger-is-greater
 */
public class BiggerIsGreater {
    private static String nextPermutation(String str) {
        // TODO
        return null;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for (int t = 0; t < testCases; t++) {
            String str = in.next();
            System.out.println(nextPermutation(str));
        }
    }
}
