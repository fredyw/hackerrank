package hackerrank;

import java.util.BitSet;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/acm-icpc-team
 */
public class ACMICPCTeam {
    private static void acmTeam(BitSet[] bitsets) {
        long maxTopic = 0;
        long maxCount = 0;
        for (int i = 0; i < bitsets.length; i++) {
            for (int j = i + 1; j < bitsets.length; j++) {
                BitSet clone = (BitSet) bitsets[i].clone();
                clone.or(bitsets[j]);
                long nTopic = clone.stream().count();
                if (nTopic == maxTopic) {
                    maxCount++;
                } else {
                    long tmpMax = Math.max(nTopic, maxTopic);
                    if (tmpMax != maxTopic) {
                        maxCount = 1;
                    }
                    maxTopic = tmpMax;
                }
            }
        }
        System.out.println(maxTopic);
        System.out.println(maxCount);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        BitSet[] bitsets = new BitSet[n];
        for (int i = 0; i < n; i++) {
            bitsets[i] = new BitSet(m);
            String bitStr = in.next();
            for (int j = 0; j < bitStr.length(); j++) {
                if (bitStr.charAt(j) == '1') {
                    bitsets[i].set(j);
                }
            }
        }
        acmTeam(bitsets);
    }
}
