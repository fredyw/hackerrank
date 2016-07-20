package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class MarsExplorationTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/mars-exploration/test1.txt"));
        MarsExploration.main(new String[]{});
    }

    @Test
    public void test2() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/mars-exploration/test2.txt"));
        MarsExploration.main(new String[]{});
    }
}