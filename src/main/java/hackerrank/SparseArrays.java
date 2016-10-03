package hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/sparse-arrays
 */
public class SparseArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String str = in.next();
            if (!map.containsKey(str)) {
                map.put(str, 1);
            } else {
                map.put(str, map.get(str) + 1);
            }
        }
        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            String str = in.next();
            if (map.containsKey(str)) {
                System.out.println(map.get(str));
            } else {
                System.out.println(0);
            }
        }
    }
}
