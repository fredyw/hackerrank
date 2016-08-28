package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class SansaAndXORTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/sansa-and-xor/test1.txt"));
        SansaAndXOR.main(new String[]{});
    }
}