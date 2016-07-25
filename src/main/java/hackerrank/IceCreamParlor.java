package hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/icecream-parlor
 */
public class IceCreamParlor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for (int t = 0; t < testCases; t++) {
            int m = in.nextInt();
            int n = in.nextInt();
            int[] array = new int[n];
            Map<Integer, List<Integer>> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int p = in.nextInt();
                array[i] = p;
                if (!map.containsKey(p)) {
                    List<Integer> list = new ArrayList<>();
                    list.add(i);
                    map.put(p, list);
                } else {
                    map.get(p).add(i);
                }
            }

            for (int i = 0; i < n; i++) {
                int p1 = array[i];
                int p2 = m - p1;
                if (map.containsKey(p2)) {
                    List<Integer> list = map.get(p2);
                    if (p1 == p2 && list.size() >= 2) {
                        System.out.println((i + 1) + " " + (list.get(1) + 1));
                        break;
                    } else if (p1 != p2) {
                        System.out.println((i + 1) + " " + (list.get(0) + 1));
                        break;
                    }
                }
            }
        }
    }
}
