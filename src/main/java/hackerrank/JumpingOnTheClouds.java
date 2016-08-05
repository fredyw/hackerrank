package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/jumping-on-the-clouds
 */
public class JumpingOnTheClouds {
    private static int minJump(int[] c) {
        int result = 0;
        int i = 0;
        while (i < c.length) {
            if (i + 2 < c.length && c[i + 2] != 1) {
                i += 2;
            } else {
                i++;
            }
            if (i < c.length) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for (int c_i = 0; c_i < n; c_i++) {
            c[c_i] = in.nextInt();
        }
        System.out.println(minJump(c));
    }
}
