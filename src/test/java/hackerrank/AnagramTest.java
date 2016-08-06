package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class AnagramTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream(""));
        Anagram.main(new String[]{});
    }
}