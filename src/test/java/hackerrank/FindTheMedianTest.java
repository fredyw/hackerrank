package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class FindTheMedianTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/find-the-median/test1.txt"));
        FindTheMedian.main(new String[]{});
    }
}