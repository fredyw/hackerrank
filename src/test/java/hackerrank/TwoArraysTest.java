package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class TwoArraysTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/two-arrays/test1.txt"));
        TwoArrays.main(new String[]{});
    }
}