package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class EqualsStackTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/equals-stack/test1.txt"));
        EqualsStack.main(new String[]{});
    }

    @Test
    public void test2() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/equals-stack/test2.txt"));
        EqualsStack.main(new String[]{});
    }
}