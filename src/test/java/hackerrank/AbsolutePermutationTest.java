package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class AbsolutePermutationTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src\\test\\resources\\absolute-permutation\\test1.txt"));
        AbsolutePermutation.main(new String[]{});
    }
}