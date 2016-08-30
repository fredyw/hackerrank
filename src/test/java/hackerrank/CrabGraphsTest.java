package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class CrabGraphsTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/crab-graphs/test1.txt"));
        CrabGraphs.main(new String[]{});
    }
}