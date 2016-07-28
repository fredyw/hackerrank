package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class CoinChangeTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/coin-change/test1.txt"));
        CoinChange.main(new String[]{});
    }

    @Test
    public void test2() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/coin-change/test2.txt"));
        CoinChange.main(new String[]{});
    }
}