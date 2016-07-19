package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class DivisibleSumPairsTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/divisible-sum-pairs/test1.txt"));
        DivisibleSumPairs.main(new String[]{});
    }
}