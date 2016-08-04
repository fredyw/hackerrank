package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/jumping-on-the-clouds-revisited
 */
public class JumpingOnTheClouds {
    private static int jumpingOnTheClouds(int[] c, int k) {
        int i = 0;
        int e = 100;
        do {
            i = (i + k) % c.length;
            e--;
            if (c[i] == 1) {
                e -= 2;
            }
        } while (i != 0);
        return e;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int c[] = new int[n];
        for (int c_i = 0; c_i < n; c_i++) {
            c[c_i] = in.nextInt();
        }
        System.out.println(jumpingOnTheClouds(c, k));
    }
}
