package hackerrank.ctci;

import org.junit.Test;

import java.io.FileInputStream;

public class LonelyIntegerTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/ctci/lonely-integer/test1.txt"));
        LonelyInteger.main(new String[]{});
    }

    @Test
    public void test2() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/ctci/lonely-integer/test2.txt"));
        LonelyInteger.main(new String[]{});
    }

    @Test
    public void test3() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/ctci/lonely-integer/test3.txt"));
        LonelyInteger.main(new String[]{});
    }
}