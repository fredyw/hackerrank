package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class CompareTheTripletsTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/compare-the-triplets/test1.txt"));
        CompareTheTriplets.main(new String[]{});
    }
}