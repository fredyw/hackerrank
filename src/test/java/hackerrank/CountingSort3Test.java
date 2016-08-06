package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class CountingSort3Test {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/counting-sort3/test1.txt"));
        CountingSort3.main(new String[]{});
    }
}