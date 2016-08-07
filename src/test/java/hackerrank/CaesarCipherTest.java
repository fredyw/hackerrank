package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class CaesarCipherTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/caesar-cipher/test1.txt"));
        CaesarCipher.main(new String[]{});
    }

    @Test
    public void test2() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/caesar-cipher/test2.txt"));
        CaesarCipher.main(new String[]{});
    }
}