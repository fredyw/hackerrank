package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/kangaroo
 */
public class Kangaroo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();

        // simplify this equation
        // x1 + (y * v1) = x2 + (y * v2)
        // y * (v2 - v1) = x1 - x2
        // y = (x1 - x2) / (v2 - v1)
        // mod = (x1 - x2) % (v2 - v1)
        // if v2 - v1 == 0 --> NO
        // if y < 0 and mod == 0 --> YES
        // else --> NO
        if (v2 - v1 == 0) {
            System.out.println("NO");
        }
        double y = (double) ((x2 - x1) / (v2 - v1));
        int mod = (x2 - x1) % (v2 - v1);
        if (y < 0 && mod == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
