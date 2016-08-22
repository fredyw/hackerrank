package hackerrank;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/sherlock-and-anagrams
 */
public class SherlockAndAnagrams {
    private static int sherlockAndAnagrams(String str) {
        Map<Character, List<Integer>> charIndices = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!charIndices.containsKey(c)) {
                List<Integer> newList = new LinkedList<>();
                newList.add(i);
                charIndices.put(c, newList);
            } else {
                charIndices.get(c).add(i);
            }
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (charIndices.containsKey(c)) {
                List<Integer> indices = charIndices.get(c);
                for (int idx : indices) {
                    if (i == idx) {
                        indices.remove(i);
                    }
                }
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for (int t = 0; t < testCases; t++) {
            String str = in.next();
            System.out.println(sherlockAndAnagrams(str));
        }
//        int count = 0;
//        int n = 3;
//        for (int step = 1; step < n; step++) {
//            for (int i = 0; i < n - step + 1; i += step) {
//                for (int j = i + 1; j < n - step + 1; j += step) {
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);
    }
}
