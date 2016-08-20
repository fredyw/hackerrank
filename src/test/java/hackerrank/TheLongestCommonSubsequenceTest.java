package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class TheLongestCommonSubsequenceTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/the-longest-common-subsequence/test1.txt"));
        TheLongestCommonSubsequence.main(new String[]{});
    }

    @Test
    public void test2() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/the-longest-common-subsequence/test2.txt"));
        TheLongestCommonSubsequence.main(new String[]{});
    }
}