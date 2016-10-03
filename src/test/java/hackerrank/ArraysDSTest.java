package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class ArraysDSTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/arrays-ds/test1.txt"));
        ArraysDS.main(new String[]{});
    }
}