package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class LibraryFineTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/library-fine/test1.txt"));
        LibraryFine.main(new String[]{});
    }
}