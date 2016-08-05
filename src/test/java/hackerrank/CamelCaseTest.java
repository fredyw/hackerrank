package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class CamelCaseTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/camel-case/test1.txt"));
        CamelCase.main(new String[]{});
    }
}