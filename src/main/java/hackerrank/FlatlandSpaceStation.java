package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/flatland-space-stations
 */
public class FlatlandSpaceStation {
    private static int flatlandSpaceStations(int n, int[] stations) {
        Arrays.sort(stations);
        int max = 0;
        int prevIdx = -1;
        int currIdx = 0;
        for (int i = 0; i < n; i++) {
            if (currIdx < stations.length && stations[currIdx] < i) {
                prevIdx = currIdx;
                currIdx++;
            }
            int prevDiff = Integer.MAX_VALUE;
            if (prevIdx != -1) {
                prevDiff = Math.abs(stations[prevIdx] - i);
            }
            int currDiff = Integer.MAX_VALUE;
            if (currIdx < stations.length) {
                currDiff = Math.abs(stations[currIdx] - i);
            }
            max = Math.max(max, Math.min(prevDiff, currDiff));
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] stations = new int[m];
        for (int i = 0; i < m; i++) {
            stations[i] = in.nextInt();
        }
        System.out.println(flatlandSpaceStations(n, stations));
    }
}
