package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class SimpleArraySumTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/simple-array-sum/test1.txt"));
        SimpleArraySum.main(new String[]{});
    }
}