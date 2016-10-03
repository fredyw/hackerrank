package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/dynamic-array
 */
public class DynamicArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<List<Integer>> seqList = new ArrayList<>();
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            seqList.add(new ArrayList<>());
        }
        int q = in.nextInt();
        int lastAns = 0;
        for (int i = 0; i < q; i++) {
            int type = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();
            if (type == 1) {
                int seq = (x ^ lastAns) % n;
                seqList.get(seq).add(y);
            } else if (type == 2) {
                int seq = (x ^ lastAns) % n;
                int idx = y % seqList.get(seq).size();
                lastAns = seqList.get(seq).get(idx);
                System.out.println(lastAns);
            }
        }
    }
}
