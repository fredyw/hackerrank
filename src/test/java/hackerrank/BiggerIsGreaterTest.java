package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class BiggerIsGreaterTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/bigger-is-greater/test1.txt"));
        BiggerIsGreater.main(new String[]{});
    }
}