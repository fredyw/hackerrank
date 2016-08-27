package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class AlmostSortedTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/almost-sorted/test1.txt"));
        AlmostSorted.main(new String[]{});
    }

    @Test
    public void test2() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/almost-sorted/test2.txt"));
        AlmostSorted.main(new String[]{});
    }

    @Test
    public void test3() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/almost-sorted/test3.txt"));
        AlmostSorted.main(new String[]{});
    }
}