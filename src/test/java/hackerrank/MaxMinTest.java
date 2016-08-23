package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class MaxMinTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/max-min/test1.txt"));
        MaxMin.main(new String[]{});
    }

    @Test
    public void test2() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/max-min/test2.txt"));
        MaxMin.main(new String[]{});
    }

    @Test
    public void test3() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/max-min/test3.txt"));
        MaxMin.main(new String[]{});
    }
}