package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class Quicksort2SortingTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/quicksort2-sorting/test1.txt"));
        Quicksort2Sorting.main(new String[]{});
    }

    @Test
    public void test2() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/quicksort2-sorting/test2.txt"));
        Quicksort2Sorting.main(new String[]{});
    }

    @Test
    public void test3() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/quicksort2-sorting/test3.txt"));
        Quicksort2Sorting.main(new String[]{});
    }
}