package hackerrank.ctci;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/ctci-making-anagrams
 */
public class MakingAnagrams {
    public static int makingAnagrams(String first, String second) {
        Map<Character, Integer> countMap = new HashMap<>();
        for (int i = 0; i < first.length(); i++) {
            char c = first.charAt(i);
            if (!countMap.containsKey(c)) {
                countMap.put(c, 1);
            } else {
                countMap.put(c, countMap.get(c) + 1);
            }
        }
        int count2 = second.length();
        for (int i = 0; i < second.length(); i++) {
            char c = second.charAt(i);
            if (countMap.containsKey(c)) {
                int count = countMap.get(c) - 1;
                if (count == 0) {
                    countMap.remove(c);
                } else {
                    countMap.put(c, count);
                }
                count2--;
            }
        }
        int count1 = 0;
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            count1 += entry.getValue();
        }
        return count1 + count2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(makingAnagrams(a, b));
    }
}
