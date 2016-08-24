package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class FibonacciModifiedTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/fibonacci-modified/test1.txt"));
        FibonacciModified.main(new String[]{});
    }
}