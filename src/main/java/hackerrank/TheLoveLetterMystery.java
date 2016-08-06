package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/the-love-letter-mystery
 */
public class TheLoveLetterMystery {
    private static int loveLetterMystery(String str) {
        int count = 0;
        char[] chars = str.toCharArray();
        for (int i = 0, j = chars.length - 1; i < j; i++, j--) {
            char left = chars[i];
            char right = chars[j];
            if (left != right) {
                if (left < right) {
                    while (left < right) {
                        right--;
                        count++;
                    }
                } else if (left > right) {
                    while (left > right) {
                        left--;
                        count++;
                    }
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
            System.out.println(loveLetterMystery(str));
        }
    }
}
