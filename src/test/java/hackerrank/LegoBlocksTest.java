package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class LegoBlocksTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/lego-blocks/test1.txt"));
        LegoBlocks.main(new String[]{});
    }
}