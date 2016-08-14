package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/jim-and-the-orders
 */
public class JimAndTheOrders {
    private static class IdxTime implements Comparable<IdxTime> {
        private final int idx;
        private final int time;

        public IdxTime(int idx, int time) {
            this.idx = idx;
            this.time = time;
        }


        @Override
        public int compareTo(IdxTime o) {
            return Integer.compare(time, o.time);
        }
    }

    private static void jimAndTheOrders(IdxTime[] idxTimes) {
        Arrays.sort(idxTimes);
        for (int i = 0; i < idxTimes.length; i++) {
            System.out.print(idxTimes[i].idx + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        IdxTime[] idxTimes = new IdxTime[n];
        for (int i = 0; i < n; i++) {
            int t = in.nextInt();
            int d = in.nextInt();
            idxTimes[i] = new IdxTime(i + 1, t + d);
        }
        jimAndTheOrders(idxTimes);
    }
}
