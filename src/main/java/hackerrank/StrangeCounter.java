package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/strange-code
 */
public class StrangeCounter {
    private static long strangeCode(long time) {
        long t = 1;
        long step = 3;
        while (t < time) {
            t += step;
            step *= 2;
        }
        if (time == t) {
            return step;
        }
        return t - time;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long t = in.nextLong();
        System.out.println(strangeCode(t));
    }
}
