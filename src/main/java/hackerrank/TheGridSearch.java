package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/the-grid-search
 */
public class TheGridSearch {
    private static String gridSearch(char[][] gridG, int maxRowG, int maxColG,
                                     char[][] gridP, int maxRowP, int maxColP) {
        char c = gridP[0][0];
        for (int rowG = 0; rowG < maxRowG; rowG++) {
            start:
            for (int colG = 0; colG < maxColG; colG++) {
                if (gridG[rowG][colG] == c) {
                    boolean found = true;
                    int row = rowG;
                    for (int rowP = 0; rowP < maxRowP; rowP++) {
                        int col = colG;
                        for (int colP = 0; colP < maxColP; colP++) {
                            if (col >= maxColG || row >= maxRowG) {
                                continue start;
                            }
                            if (gridG[row][col] != gridP[rowP][colP]) {
                                continue start;
                            }
                            col++;
                        }
                        row++;
                    }
                    if (found) {
                        return "YES";
                    }
                }
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for (int t = 0; t < testCases; t++) {
            int rowG = in.nextInt();
            int colG = in.nextInt();
            char[][] gridG = new char[rowG][colG];
            for (int i = 0; i < rowG; i++) {
                gridG[i] = in.next().toCharArray();
            }
            int rowP = in.nextInt();
            int colP = in.nextInt();
            char[][] gridP = new char[rowP][colP];
            for (int i = 0; i < rowP; i++) {
                gridP[i] = in.next().toCharArray();
            }
            System.out.println(gridSearch(gridG, rowG, colG, gridP, rowP, colP));
        }
    }
}
