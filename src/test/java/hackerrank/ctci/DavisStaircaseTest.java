package hackerrank.ctci;

import org.junit.Test;

import java.io.FileInputStream;

public class DavisStaircaseTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/ctci/davis-staircase/test1.txt"));
        DavisStaircase.main(new String[]{});
    }
}