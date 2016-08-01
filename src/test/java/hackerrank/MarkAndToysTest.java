package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class MarkAndToysTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/mark-and-toys/test1.txt"));
        MarkAndToys.main(new String[]{});
    }
}