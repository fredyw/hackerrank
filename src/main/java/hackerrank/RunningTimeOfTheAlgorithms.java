package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/runningtime
 */
public class RunningTimeOfTheAlgorithms {
    private static int runningTime(int[] array) {
        int shifts = 0;
        for (int i = 1; i < array.length; i++) {
            int value = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > value) {
                array[j + 1] = array[j];
                j = j - 1;
                shifts++;
            }
            array[j + 1] = value;
        }
        return shifts;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        System.out.println(runningTime(a));
    }
}
