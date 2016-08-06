package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class MakingAnagramsTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/making-anagrams/test1.txt"));
        MakingAnagrams.main(new String[]{});
    }
}