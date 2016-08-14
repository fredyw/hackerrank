package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/sherlock-and-the-beast
 */
public class SherlockAndTheBeast {
    private static String sherlockAndTheBeast(int n) {
        StringBuilder sb = new StringBuilder();
        int div3 = (n / 3) * 3;
        while (div3 > 0) {
            int mod = n % div3;
            if (div3 % 3 == 0 && mod % 5 == 0) {
                for (int i = 0; i < div3; i++) {
                    sb.append("5");
                }
                for (int i = 0; i < mod; i++) {
                    sb.append("3");
                }
                break;
            }
            div3 -= 3;
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        int div5 = (n / 5) * 5;
        while (div5 > 0) {
            int mod = n % div5;
            if (div5 % 5 == 0 && mod % 3 == 0) {
                for (int i = 0; i < mod; i++) {
                    sb.append("5");
                }
                for (int i = 0; i < div5; i++) {
                    sb.append("3");
                }
                break;
            }
            div5 -= 5;
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return "-1";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for (int t = 0; t < testCases; t++) {
            int n = in.nextInt();
            System.out.println(sherlockAndTheBeast(n));
        }
    }
}
