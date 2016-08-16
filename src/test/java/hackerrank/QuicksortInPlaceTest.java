package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class QuicksortInPlaceTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/quicksort-in-place/test1.txt"));
        QuicksortInPlace.main(new String[]{});
    }

    @Test
    public void test2() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/quicksort-in-place/test2.txt"));
        QuicksortInPlace.main(new String[]{});
    }

    @Test
    public void test3() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/quicksort-in-place/test3.txt"));
        QuicksortInPlace.main(new String[]{});
    }
}