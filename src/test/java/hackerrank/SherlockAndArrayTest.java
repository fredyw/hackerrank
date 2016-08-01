package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class SherlockAndArrayTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/sherlock-and-array/test1.txt"));
        SherlockAndArray.main(new String[]{});
    }
}