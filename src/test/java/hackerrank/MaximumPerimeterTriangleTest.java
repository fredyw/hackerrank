package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class MaximumPerimeterTriangleTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/maximum-perimeter-triangle/test1.txt"));
        MaximumPerimeterTriangle.main(new String[]{});
    }

    @Test
    public void test2() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/maximum-perimeter-triangle/test2.txt"));
        MaximumPerimeterTriangle.main(new String[]{});
    }
}