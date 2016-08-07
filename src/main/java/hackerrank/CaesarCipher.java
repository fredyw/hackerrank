package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/caesar-cipher-1
 */
public class CaesarCipher {
    private static String caesarCipher(String str, int k) {
        int newK = k % 26;
        char[] chars = str.toCharArray();
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                if (chars[i] + newK > 'z') {
                    newStr.append((char) (chars[i] + newK - 26));
                } else {
                    newStr.append((char) (chars[i] + newK));
                }
            } else if (chars[i] >= 'A' && chars[i] <= 'Z') {
                if (chars[i] + newK > 'Z') {
                    newStr.append((char) (chars[i] + newK - 26));
                } else {
                    newStr.append((char) (chars[i] + newK));
                }
            } else {
                newStr.append(chars[i]);
            }
        }
        return newStr.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str = in.next();
        int k = in.nextInt();
        System.out.println(caesarCipher(str, k));
    }
}
