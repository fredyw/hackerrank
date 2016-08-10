package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/flatland-space-stations
 */
public class FlatlandSpaceStation {
    private static int flatlandSpaceStations(int n, int[] stations) {
        int max = 0;
        // TODO
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] stations = new int[n];
        for (int i = 0; i < m; i++) {
            stations[i] = in.nextInt();
        }
        System.out.println(flatlandSpaceStations(n, stations));
    }
}
