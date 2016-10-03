package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/2d-array
 */
public class TwoDArrayDS {
    private static int hourglass(int[][] array) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] array = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                array[i][j] = in.nextInt();
            }
        }
        System.out.println(hourglass(array));
    }
}
