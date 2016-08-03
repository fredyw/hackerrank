package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class LargestPermutationTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/largest-permutation/test1.txt"));
        LargestPermutation.main(new String[]{});
    }

    @Test
    public void test2() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/largest-permutation/test2.txt"));
        LargestPermutation.main(new String[]{});
    }

    @Test
    public void test3() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/largest-permutation/test3.txt"));
        LargestPermutation.main(new String[]{});
    }

    @Test
    public void test4() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/largest-permutation/test4.txt"));
        LargestPermutation.main(new String[]{});
    }
}