package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class TwoStringsTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/two-strings/test1.txt"));
        TwoStrings.main(new String[]{});
    }
}