package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class MaximizingXORTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/maximizing-xor/test1.txt"));
        MaximizingXOR.main(new String[]{});
    }
}