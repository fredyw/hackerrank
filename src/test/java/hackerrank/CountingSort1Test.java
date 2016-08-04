package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class CountingSort1Test {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/counting-sort1/test1.txt"));
        CountingSort1.main(new String[]{});
    }
}