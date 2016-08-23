package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class CountLuckTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/count-luck/test1.txt"));
        CountLuck.main(new String[]{});
    }

    @Test
    public void test2() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/count-luck/test2.txt"));
        CountLuck.main(new String[]{});
    }
}