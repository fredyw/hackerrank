package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class StrangeCounterTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/strange-counter/test1.txt"));
        StrangeCounter.main(new String[]{});
    }
}