package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class StockMaximizeTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/stock-maximize/test1.txt"));
        StockMaximize.main(new String[]{});
    }
}