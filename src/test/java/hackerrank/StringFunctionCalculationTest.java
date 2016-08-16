package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class StringFunctionCalculationTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/string-function-calculation/test1.txt"));
        StringFunctionCalculation.main(new String[]{});
    }

    @Test
    public void test2() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/string-function-calculation/test2.txt"));
        StringFunctionCalculation.main(new String[]{});
    }
}