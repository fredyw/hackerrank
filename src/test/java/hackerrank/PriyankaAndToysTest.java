package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class PriyankaAndToysTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/priyanka-and-toys/test1.txt"));
        PriyankaAndToys.main(new String[]{});
    }

    @Test
    public void test2() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/priyanka-and-toys/test2.txt"));
        PriyankaAndToys.main(new String[]{});
    }

    @Test
    public void test3() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/priyanka-and-toys/test3.txt"));
        PriyankaAndToys.main(new String[]{});
    }
}