package hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/anagram
 */
public class Anagram {
    private static int anagram(String str) {
        if (str.length() % 2 != 0) {
            return -1;
        }
        int mid = str.length() / 2;
        String str1 = str.substring(0, mid);
        String str2 = str.substring(mid);
        Map<Character, Integer> counts = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            if (!counts.containsKey(c)) {
                counts.put(c, 1);
            } else {
                counts.put(c, counts.get(c) + 1);
            }
        }
        for (int i = 0; i < str2.length(); i++) {
            char c = str2.charAt(i);
            if (counts.containsKey(c)) {
                int count = counts.get(c);
                count--;
                if (count == 0) {
                    counts.remove(c);
                } else {
                    counts.put(c, count);
                }
            }
        }
        int count = 0;
        for (Map.Entry<Character, Integer> e : counts.entrySet()) {
            count += e.getValue();
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for (int t = 0; t < testCases; t++) {
            String str = in.next();
            System.out.println(anagram(str));
        }
    }
}
