package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class DiagonalDifferenceTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/diagonal-difference/test1.txt"));
        DiagonalDifference.main(new String[]{});
    }
}