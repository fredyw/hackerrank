package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class AnagramTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/anagram/test1.txt"));
        Anagram.main(new String[]{});
    }
}