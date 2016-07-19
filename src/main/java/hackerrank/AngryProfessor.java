package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/angry-professor
 */
public class AngryProfessor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for (int t = 0; t < testCases; t++) {
            int n = in.nextInt();
            int k = in.nextInt();
            int onTime = 0;
            for (int i = 0; i < n; i++) {
                int a = in.nextInt();
                if (a <= 0) {
                    onTime++;
                }
            }
            if (onTime >= k) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
