package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class SolveMeFistTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/solve-me-first/test1.txt"));
        SolveMeFist.main(new String[]{});
    }
}