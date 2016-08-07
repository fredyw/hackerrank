package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class PalindromeIndexTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/palindrome-index/test1.txt"));
        PalindromeIndex.main(new String[]{});
    }
}