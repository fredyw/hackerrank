package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class TheGridSearchTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/the-grid-search/test1.txt"));
        TheGridSearch.main(new String[]{});
    }
}