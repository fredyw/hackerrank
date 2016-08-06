package hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GameOfThrones1 {
    private static String isPalindrome(String str) {
        Map<Character, Integer> counts = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!counts.containsKey(c)) {
                counts.put(c, 1);
            } else {
                counts.put(c, counts.get(c) + 1);
            }
        }
        int odd = 0;
        for (Map.Entry<Character, Integer> e : counts.entrySet()) {
            if (e.getValue() % 2 != 0) {
                odd++;
            }
        }
        if (odd > 1) {
            return "NO";
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(isPalindrome(str));
    }
}
