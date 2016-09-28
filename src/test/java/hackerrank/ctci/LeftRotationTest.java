package hackerrank.ctci;

import org.junit.Test;

import java.io.FileInputStream;

public class LeftRotationTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/ctci/left-rotation/test1.txt"));
        LeftRotation.main(new String[]{});
    }
}