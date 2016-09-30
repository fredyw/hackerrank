package hackerrank.ctci;

import org.junit.Test;

import java.io.FileInputStream;

public class CountingInversionsTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/ctci/counting-inversions/test1.txt"));
        CountingInversions.main(new String[]{});
    }

    @Test
    public void test2() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/ctci/counting-inversions/test2.txt"));
        CountingInversions.main(new String[]{});
    }
}