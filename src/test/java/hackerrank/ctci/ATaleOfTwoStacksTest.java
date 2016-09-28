package hackerrank.ctci;

import org.junit.Test;

import java.io.FileInputStream;

public class ATaleOfTwoStacksTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/ctci/a-tale-of-two-stacks/test1.txt"));
        ATaleOfTwoStacks.main(new String[]{});
    }

    @Test
    public void test2() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/ctci/a-tale-of-two-stacks/test2.txt"));
        ATaleOfTwoStacks.main(new String[]{});
    }
}