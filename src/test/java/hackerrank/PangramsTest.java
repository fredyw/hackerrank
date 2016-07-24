package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class PangramsTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/pangrams/test1.txt"));
        Pangrams.main(new String[]{});
    }

    @Test
    public void test2() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/pangrams/test2.txt"));
        Pangrams.main(new String[]{});
    }
}