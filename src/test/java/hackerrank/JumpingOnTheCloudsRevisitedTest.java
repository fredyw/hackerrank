package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class JumpingOnTheCloudsRevisitedTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/jumping-on-the-clouds/test1.txt"));
        JumpingOnTheCloudsRevisited.main(new String[]{});
    }
}