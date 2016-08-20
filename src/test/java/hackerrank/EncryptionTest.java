package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class EncryptionTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/encryption/test1.txt"));
        Encryption.main(new String[]{});
    }

    @Test
    public void test2() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/encryption/test2.txt"));
        Encryption.main(new String[]{});
    }

    @Test
    public void test3() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/encryption/test3.txt"));
        Encryption.main(new String[]{});
    }

    @Test
    public void test4() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/encryption/test4.txt"));
        Encryption.main(new String[]{});
    }
}