package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class MinimumDistancesTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/minimum-distances/test1.txt"));
        MinimumDistances.main(new String[]{});
    }
}