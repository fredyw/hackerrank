package hackerrank.ctci;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/ctci-ransom-note
 */
public class RansomNote {
    private static String ransomNote(List<String> magazine, List<String> ransom) {
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : magazine) {
            if (!wordCount.containsKey(word)) {
                wordCount.put(word, 1);
            } else {
                wordCount.put(word, wordCount.get(word) + 1);
            }
        }
        for (String word : ransom) {
            if (!wordCount.containsKey(word)) {
                return "No";
            }
            int count = wordCount.get(word) - 1;
            if (count == 0) {
                wordCount.remove(word);
            } else {
                wordCount.put(word, count);
            }
        }
        return "Yes";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        List<String> magazine = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String word = in.next();
            magazine.add(word);
        }
        List<String> ransom = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String word = in.next();
            ransom.add(word);
        }
        System.out.println(ransomNote(magazine, ransom));
    }
}
