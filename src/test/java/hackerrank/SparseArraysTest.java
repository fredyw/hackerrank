package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class SparseArraysTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/sparse-arrays/test1.txt"));
        SparseArrays.main(new String[]{});
    }
}