package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class CircularArrayRotationTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/circular-array-rotation/test1.txt"));
        CircularArrayRotation.main(new String[]{});
    }

    @Test
    public void test2() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/circular-array-rotation/test2.txt"));
        CircularArrayRotation.main(new String[]{});
    }
}