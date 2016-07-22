package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class InsertionSortPart1Test {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/insertion-sort-part1/test1.txt"));
        InsertionSortPart1.main(new String[]{});
    }
}