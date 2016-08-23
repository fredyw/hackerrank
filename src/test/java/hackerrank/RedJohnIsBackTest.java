package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class RedJohnIsBackTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/red-john-is-back/test1.txt"));
        RedJohnIsBack.main(new String[]{});
    }
}