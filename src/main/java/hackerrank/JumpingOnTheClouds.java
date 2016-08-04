package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/jumping-on-the-clouds-revisited
 */
public class JumpingOnTheClouds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int c[] = new int[n];
        for (int c_i = 0; c_i < n; c_i++) {
            c[c_i] = in.nextInt();
        }
    }
}
