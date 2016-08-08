package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/utopian-tree
 */
public class UtopianTree {
    private static int utopianTree(int n) {
        int height = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                height *= 2;
            } else {
                height++;
            }
        }
        return height;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for (int t = 0; t < testCases; t++) {
            int n = in.nextInt();
            System.out.println(utopianTree(n));
        }
    }
}
