package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class WhatsNextTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/whats-next/test1.txt"));
        WhatsNext.main(new String[]{});
    }
}