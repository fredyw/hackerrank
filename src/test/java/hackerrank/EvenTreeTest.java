package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class EvenTreeTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/even-tree/test1.txt"));
        EvenTree.main(new String[]{});
    }
}