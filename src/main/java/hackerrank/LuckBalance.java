package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/luck-balance
 */
public class LuckBalance {
    private static int luckBalance(int k,
                                   List<Integer> importantList,
                                   List<Integer> unimportantList) {
        int balance = 0;
        for (int luck : unimportantList) {
            balance += luck;
        }
        Collections.sort(importantList, (a, b) -> b.compareTo(a));
        int idx = 0;
        for (; idx < k; idx++) {
            balance += importantList.get(idx);
        }
        for (; idx < importantList.size(); idx++) {
            balance -= importantList.get(idx);
        }
        return balance;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        List<Integer> importantList = new ArrayList<>();
        List<Integer> unimportantList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int l = in.nextInt();
            int t = in.nextInt();
            if (t == 0) {
                unimportantList.add(l);
            } else {
                importantList.add(l);
            }
        }
        System.out.println(luckBalance(k, importantList, unimportantList));
    }
}
