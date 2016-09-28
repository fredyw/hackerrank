package hackerrank.ctci;

import org.junit.Test;

import java.io.FileInputStream;

public class PrimalityTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/ctci/primality/test1.txt"));
        Primality.main(new String[]{});
    }
}