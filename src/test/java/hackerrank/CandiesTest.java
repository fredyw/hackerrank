package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class CandiesTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/candies/test1.txt"));
        Candies.main(new String[]{});
    }

    @Test
    public void test2() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/candies/test2.txt"));
        Candies.main(new String[]{});
    }
}