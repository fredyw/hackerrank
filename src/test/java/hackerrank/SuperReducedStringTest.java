package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class SuperReducedStringTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/super-reduced-string/test1.txt"));
        SuperReducedString.main(new String[]{});
    }
}