package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class PlusMinusTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/plus-minus/test1.txt"));
        PlusMinus.main(new String[]{});
    }
}