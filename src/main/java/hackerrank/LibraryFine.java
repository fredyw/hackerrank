package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/library-fine
 */
public class LibraryFine {
    private static int libraryFine(int actualDay, int actualMonth, int actualYear,
                                   int expectedDay, int expectedMonth, int expectedYear) {
        if (actualYear < expectedYear) {
            return 0;
        }
        if (actualYear > expectedYear) {
            return 10000;
        }
        if (actualMonth > expectedMonth) {
            return 500 * (actualMonth - expectedMonth);
        } else if (actualMonth < expectedDay) {
            return 0;
        }

        if (actualDay > expectedDay) {
            return 15 * (actualDay - expectedDay);
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int actualDay = in.nextInt();
        int actualMonth = in.nextInt();
        int actualYear = in.nextInt();
        int expectedDay = in.nextInt();
        int expectedMonth = in.nextInt();
        int expectedYear = in.nextInt();
        System.out.println(libraryFine(actualDay, actualMonth, actualYear,
            expectedDay, expectedMonth, expectedYear));
    }
}
