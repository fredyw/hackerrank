package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class LibraryFineTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/library-fine/test1.txt"));
        LibraryFine.main(new String[]{});
    }

    @Test
    public void test2() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/library-fine/test2.txt"));
        LibraryFine.main(new String[]{});
    }

    @Test
    public void test3() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/library-fine/test3.txt"));
        LibraryFine.main(new String[]{});
    }

    @Test
    public void test4() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/library-fine/test4.txt"));
        LibraryFine.main(new String[]{});
    }
}