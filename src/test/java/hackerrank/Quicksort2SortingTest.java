package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class Quicksort2SortingTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/quicksort2-sorting/test1.txt"));
        Quicksort2Sorting.main(new String[]{});
    }
}