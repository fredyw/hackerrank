package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class SherlockAndSquaresTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/sherlock-and-squares/test1.txt"));
        SherlockAndSquares.main(new String[]{});
    }
}