package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/encryption
 */
public class Encryption {
    private static String encryption(String str) {
        String newStr = str.replaceAll("\\s+", "");
        double sqrt = Math.sqrt(newStr.length());
        int row = (int) Math.ceil(sqrt);
        int col = (int) Math.ceil(sqrt);
        char[][] chars = new char[row][col];
        int idx = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (idx == newStr.length()) {
                    break;
                }
                chars[i][j] = newStr.charAt(idx++);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                if (chars[j][i] == 0) {
                    continue;
                }
                sb.append(chars[j][i]);
            }
            sb.append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(encryption(str));
    }
}
