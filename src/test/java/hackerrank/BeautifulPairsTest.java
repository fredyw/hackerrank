package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class BeautifulPairsTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/beautiful-pairs/test1.txt"));
        BeautifulPairs.main(new String[]{});
    }
}