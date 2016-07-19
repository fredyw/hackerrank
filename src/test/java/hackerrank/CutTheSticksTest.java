package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class CutTheSticksTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/cut-the-sticks/test1.txt"));
        CutTheSticks.main(new String[]{});
    }

    @Test
    public void test2() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/cut-the-sticks/test2.txt"));
        CutTheSticks.main(new String[]{});
    }
}