package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/string-construction
 */
public class StringConstruction {
    private static int stringConstruction(String str) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String str = in.next();
            System.out.println(stringConstruction(str));
        }
    }
}
