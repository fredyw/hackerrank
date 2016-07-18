package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class TimeConversionTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/time-conversion/test1.txt"));
        TimeConversion.main(new String[]{});
    }
}