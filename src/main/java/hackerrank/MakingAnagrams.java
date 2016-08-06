package hackerrank;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/making-anagrams
 */
public class MakingAnagrams {
    private static int makingAnagrams(String a, String b) {
        Map<Character, Integer> mapA = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (!mapA.containsKey(c)) {
                mapA.put(c, 1);
            } else {
                mapA.put(c, mapA.get(c) + 1);
            }
        }
        Map<Character, Integer> mapB = new HashMap<>();
        for (int i = 0; i < b.length(); i++) {
            char c = b.charAt(i);
            if (!mapB.containsKey(c)) {
                mapB.put(c, 1);
            } else{
                mapB.put(c, mapB.get(c) + 1);
            }
        }
        Iterator<Map.Entry<Character, Integer>> iter = mapA.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<Character, Integer> entry = iter.next();
            char c = entry.getKey();
            int countA = entry.getValue();
            if (mapB.containsKey(c)) {
                int countB = mapB.get(c);
                if (countA < countB) {
                    iter.remove();
                    mapB.put(c, countB - countA);
                } else if (countA > countB) {
                    entry.setValue(countA - countB);
                    mapB.remove(c);
                } else {
                    iter.remove();
                    mapB.remove(c);
                }
            }
        }
        int count = 0;
        for (Map.Entry<Character, Integer> e : mapA.entrySet()) {
            count += e.getValue();
        }
        for (Map.Entry<Character, Integer> e : mapB.entrySet()) {
            count += e.getValue();
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(makingAnagrams(a, b));
    }
}
