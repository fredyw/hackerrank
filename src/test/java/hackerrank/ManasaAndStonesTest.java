package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class ManasaAndStonesTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/manasa-and-stones/test1.txt"));
        ManasaAndStones.main(new String[]{});
    }
}