package hackerrank;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * https://www.hackerrank.com/challenges/gem-stones
 */
public class Gamestones {
    private static int gemstones(String[] gems) {
        int result = 0;
        List<Set<Character>> gemSets = new ArrayList<>();
        for (String gem : gems) {
            Set<Character> set = new HashSet<>();
            char[] chars = gem.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                set.add(chars[i]);
            }
            gemSets.add(set);
        }
        for (char c = 'a'; c <= 'z'; c++) {
            int count = 0;
            for (Set<Character> set : gemSets) {
                if (set.contains(c)) {
                    count++;
                }
            }
            if (count == gems.length) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] gems = new String[n];
        for (int i = 0; i < n; i++) {
            gems[i] = in.next();
        }
        System.out.println(gemstones(gems));
    }
}
