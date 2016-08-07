package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class FlippingBitsTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/flipping-bits/test1.txt"));
        FlippingBits.main(new String[]{});
    }
}