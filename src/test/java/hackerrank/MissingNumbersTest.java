package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class MissingNumbersTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/missing-numbers/test1.txt"));
        MissingNumbers.main(new String[]{});
    }
}