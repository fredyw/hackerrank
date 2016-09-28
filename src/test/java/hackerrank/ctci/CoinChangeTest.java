package hackerrank.ctci;

import org.junit.Test;

import java.io.FileInputStream;

public class CoinChangeTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/ctci/coin-change/test1.txt"));
        CoinChange.main(new String[]{});
    }

    @Test
    public void test2() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/ctci/coin-change/test12.txt"));
        CoinChange.main(new String[]{});
    }
}