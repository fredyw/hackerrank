package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class BreadthFirstSearchShortestReachTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/breadth-first-search-shortest-reach/test1.txt"));
        BreadthFirstSearchShortestReach.main(new String[]{});
    }
}