package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class PairsTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/pairs/test1.txt"));
        Pairs.main(new String[]{});
    }
}