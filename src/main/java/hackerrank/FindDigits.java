package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/find-digits
 */
public class FindDigits {
    private static int findDigits(String str) {
        int num = Integer.parseInt(str);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            int n = Integer.parseInt("" + str.charAt(i));
            if (n != 0) {
                if (num % n == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for (int t = 0; t < testCases; t++) {
            String str = in.next();
            System.out.println(findDigits(str));
        }
    }
}
