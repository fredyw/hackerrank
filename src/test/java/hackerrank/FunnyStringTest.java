package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class FunnyStringTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/funny-string/test1.txt"));
        FunnyString.main(new String[]{});
    }
}