package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class StringConstructionTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/string-construction/test1.txt"));
        StringConstruction.main(new String[]{});
    }
}