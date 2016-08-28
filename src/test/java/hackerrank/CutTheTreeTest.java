package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class CutTheTreeTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/cut-the-tree/test1.txt"));
        CutTheTree.main(new String[]{});
    }
}