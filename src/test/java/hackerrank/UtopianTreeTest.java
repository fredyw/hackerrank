package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class UtopianTreeTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/utopian-tree/test1.txt"));
        UtopianTree.main(new String[]{});
    }
}