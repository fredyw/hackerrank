package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class ClosestNumbersTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/closest-numbers/test1.txt"));
        ClosestNumbers.main(new String[]{});
    }

    @Test
    public void test2() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/closest-numbers/test2.txt"));
        ClosestNumbers.main(new String[]{});
    }

    @Test
    public void test3() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/closest-numbers/test3.txt"));
        ClosestNumbers.main(new String[]{});
    }
}