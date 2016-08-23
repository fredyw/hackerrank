package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class GreedyFloristTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/greedy-florist/test1.txt"));
        GreedyFlorist.main(new String[]{});
    }

    @Test
    public void test2() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/greedy-florist/test2.txt"));
        GreedyFlorist.main(new String[]{});
    }
}