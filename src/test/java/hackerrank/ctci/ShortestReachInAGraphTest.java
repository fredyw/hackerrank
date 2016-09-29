package hackerrank.ctci;

import org.junit.Test;

import java.io.FileInputStream;

public class ShortestReachInAGraphTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/shortest-reach-in-a-graph/test1.txt"));
        ShortestReachInAGraph.main(new String[]{});
    }
}