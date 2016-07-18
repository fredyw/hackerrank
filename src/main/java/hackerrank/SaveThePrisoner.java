package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/save-the-prisoner
 */
public class SaveThePrisoner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for (int t = 0; t < testCases; t++) {
            long n = in.nextLong();
            long m = in.nextLong();
            long s = in.nextLong();
            long x = m % n;
            long prison = x + s - 1;
            if (prison == 0) {
                prison = n;
            } else if (prison > n) {
                prison -= n;
            }
            System.out.println(prison);
        }
    }
}
