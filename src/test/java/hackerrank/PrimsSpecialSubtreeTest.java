package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class PrimsSpecialSubtreeTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/prims-special-subtree/test1.txt"));
        PrimsSpecialSubtree.main(new String[]{});
    }
}