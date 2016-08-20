package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class SherlockAndAnagramsTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/sherlock-and-anagrams/test1.txt"));
        SherlockAndAnagrams.main(new String[]{});
    }

    @Test
    public void test2() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/sherlock-and-anagrams/test2.txt"));
        SherlockAndAnagrams.main(new String[]{});
    }
}