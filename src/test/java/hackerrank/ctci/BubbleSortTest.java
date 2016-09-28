package hackerrank.ctci;

import org.junit.Test;

import java.io.FileInputStream;

public class BubbleSortTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/ctci/bubble-sort/test1.txt"));
        BubbleSort.main(new String[]{});
    }

    @Test
    public void test2() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/ctci/bubble-sort/test2.txt"));
        BubbleSort.main(new String[]{});
    }
}