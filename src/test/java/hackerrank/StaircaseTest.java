package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class StaircaseTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/staircase/test1.txt"));
        Staircase.main(new String[]{});
    }
}