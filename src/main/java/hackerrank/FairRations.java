package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/fair-rations
 */
public class FairRations {
    private static void fairRations(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        if (sum % 2 != 0) {
            System.out.println("NO");
            return;
        }
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] % 2 != 0) {
                array[i]++;
                array[i + 1]++;
                count += 2;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int B[] = new int[N];
        for (int B_i = 0; B_i < N; B_i++) {
            B[B_i] = in.nextInt();
        }
        fairRations(B);
    }
}
