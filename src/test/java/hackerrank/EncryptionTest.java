package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class EncryptionTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/encryption/test1.txt"));
        Encryption.main(new String[]{});
    }
}