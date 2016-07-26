package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/beautiful-binary-string
 */
public class BeautifyingBinaryString {
    private static int beautify(String str) {
        int count = 0;
        int idx = 0;
        while (idx + 3 <= str.length()) {
            String sub = str.substring(idx, idx + 3);
            if (sub.equals("010")) {
                count++;
                idx += 3;
            } else {
                idx++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str = in.next();
        System.out.println(beautify(str));
    }
}
