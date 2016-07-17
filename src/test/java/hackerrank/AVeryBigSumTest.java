package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class AVeryBigSumTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/a-very-big-sum/test1.txt"));
        AVeryBigSum.main(new String[]{});
    }
}