package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class FindDigitsTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/find-digits/test1.txt"));
        FindDigits.main(new String[]{});
    }
}