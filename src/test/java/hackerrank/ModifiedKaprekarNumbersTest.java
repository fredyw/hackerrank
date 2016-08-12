package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class ModifiedKaprekarNumbersTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/modified-kaprekar-numbers/test1.txt"));
        ModifiedKaprekarNumbers.main(new String[]{});
    }
}