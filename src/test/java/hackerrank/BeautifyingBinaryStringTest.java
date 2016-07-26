package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class BeautifyingBinaryStringTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/beautifying-binary-string/test1.txt"));
        BeautifyingBinaryString.main(new String[]{});
    }

    @Test
    public void test2() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/beautifying-binary-string/test2.txt"));
        BeautifyingBinaryString.main(new String[]{});
    }

    @Test
    public void test3() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/beautifying-binary-string/test2.txt"));
        BeautifyingBinaryString.main(new String[]{});
    }
}