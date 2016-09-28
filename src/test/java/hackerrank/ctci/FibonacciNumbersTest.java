package hackerrank.ctci;

import org.junit.Test;

import java.io.FileInputStream;

public class FibonacciNumbersTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/ctci/fibonacci-numbers/test1.txt"));
        FibonacciNumbers.main(new String[]{});
    }
}