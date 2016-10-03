package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class TwoDArrayDSTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/2d-arrays-ds/test1.txt"));
        TwoDArrayDS.main(new String[]{});
    }
}