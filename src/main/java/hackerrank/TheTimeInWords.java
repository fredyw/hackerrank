package hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/the-time-in-words
 */
public class TheTimeInWords {
    private static final Map<Integer, String> dict = new HashMap<>();
    static {
        dict.put(1, "one");
        dict.put(2, "two");
        dict.put(3, "three");
        dict.put(4, "four");
        dict.put(5, "five");
        dict.put(6, "six");
        dict.put(7, "seven");
        dict.put(8, "eight");
        dict.put(9, "nine");
        dict.put(10, "ten");
        dict.put(11, "eleven");
        dict.put(12, "twelve");
        dict.put(13, "thirteen");
        dict.put(14, "fourteen");
        dict.put(15, "fifteen");
        dict.put(16, "sixteen");
        dict.put(17, "seventeen");
        dict.put(18, "eighteen");
        dict.put(19, "nineteen");
        dict.put(20, "twenty");
        for (int i = 1; i <= 9; i++) {
            dict.put(20 + i, "twenty " + dict.get(i));
        }
    }

    private static String timeInWords(int hours, int minutes) {
        if (minutes == 0) {
            return dict.get(hours) + " o' clock";
        }
        if (minutes == 15) {
            return "quarter past " + dict.get(hours);
        }
        if (minutes == 30) {
            return "half past " + dict.get(hours);
        }
        if (minutes == 45) {
            return "quarter to " + dict.get(hours + 1);
        }
        String min = "minute";
        if (minutes > 1) {
            min += "s";
        }
        if (minutes < 30) {
            return dict.get(minutes) + " " + min + " past " + dict.get(hours);
        }
        return dict.get(60 - minutes) + " " + min + " to " + dict.get(hours + 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int hours = in.nextInt();
        int minutes = in.nextInt();
        System.out.println(timeInWords(hours, minutes));
    }
}
