package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class InsertionSortPart2Test {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/insertion-sort-part2/test1.txt"));
        InsertionSortPart2.main(new String[]{});
    }
}