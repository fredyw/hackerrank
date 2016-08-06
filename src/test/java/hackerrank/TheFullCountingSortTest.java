package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class TheFullCountingSortTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/the-full-counting-sort/test1.txt"));
        TheFullCountingSort.main(new String[]{});
    }
}