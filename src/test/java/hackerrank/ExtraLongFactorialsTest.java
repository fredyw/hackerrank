package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class ExtraLongFactorialsTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/extra-long-factorials/test1.txt"));
        ExtraLongFactorials.main(new String[]{});
    }
}