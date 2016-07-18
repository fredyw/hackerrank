package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/time-conversion
 */
public class TimeConversion {
    private static void convert(String str) {
        String[] split = str.split(":");
        int hour = Integer.parseInt(split[0]);
        int minute = Integer.parseInt(split[1]);
        int second = Integer.parseInt(split[2].substring(0, 2));
        String ampm = split[2].substring(2);
        if (ampm.equals("PM") && hour < 12) {
            hour += 12;
        } else if (ampm.equals("AM") && hour == 12) {
            hour = 0;
        }
        System.out.printf("%02d:%02d:%02d\n", hour, minute, second);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        convert(str);
    }
}
