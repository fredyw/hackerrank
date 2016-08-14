package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class SherlockAndTheBeastTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/sherlock-and-the-beast/test1.txt"));
        SherlockAndTheBeast.main(new String[]{});
    }
}