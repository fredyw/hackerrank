package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class PriyankaAndToysTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/priyanka-and-toys/test1.txt"));
        PriyankaAndToys.main(new String[]{});
    }
}