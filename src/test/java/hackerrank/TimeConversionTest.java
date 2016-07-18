package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class TimeConversionTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/time-conversion/test1.txt"));
        TimeConversion.main(new String[]{});
    }

    @Test
    public void test2() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/time-conversion/test2.txt"));
        TimeConversion.main(new String[]{});
    }

    @Test
    public void test3() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/time-conversion/test3.txt"));
        TimeConversion.main(new String[]{});
    }

    @Test
    public void test4() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/time-conversion/test4.txt"));
        TimeConversion.main(new String[]{});
    }
}