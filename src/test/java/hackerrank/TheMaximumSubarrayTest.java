package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class TheMaximumSubarrayTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/the-maximum-subarray/test1.txt"));
        TheMaximumSubarray.main(new String[]{});
    }

    @Test
    public void test2() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/the-maximum-subarray/test2.txt"));
        TheMaximumSubarray.main(new String[]{});
    }
}