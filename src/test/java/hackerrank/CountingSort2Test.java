package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class CountingSort2Test {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/counting-sort2/test2.txt"));
        CountingSort2.main(new String[]{});
    }
}