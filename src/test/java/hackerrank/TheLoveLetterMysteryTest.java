package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class TheLoveLetterMysteryTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/the-love-letter-mystery/test1.txt"));
        TheLoveLetterMystery.main(new String[]{});
    }
}