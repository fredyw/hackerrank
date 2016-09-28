package hackerrank.ctci;

import org.junit.Test;

import java.io.FileInputStream;

public class ComparatorTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/ctci/comparator/test1.txt"));
        Comparator.main(new String[]{});
    }
}