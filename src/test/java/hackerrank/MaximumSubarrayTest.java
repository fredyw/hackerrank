package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class MaximumSubarrayTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/the-maximum-subarray/test1.txt"));
        MaximumSubarray.main(new String[]{});
    }

    @Test
    public void test2() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/the-maximum-subarray/test2.txt"));
        MaximumSubarray.main(new String[]{});
    }

    @Test
    public void test3() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/the-maximum-subarray/test3.txt"));
        MaximumSubarray.main(new String[]{});
    }
}