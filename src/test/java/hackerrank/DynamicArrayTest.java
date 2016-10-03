package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class DynamicArrayTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/dynamic-array/test1.txt"));
        DynamicArray.main(new String[]{});
    }
}