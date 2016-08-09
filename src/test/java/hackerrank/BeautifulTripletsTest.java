package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class BeautifulTripletsTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/beautiful-triplets/test1.txt"));
        BeautifulTriplets.main(new String[]{});
    }
}