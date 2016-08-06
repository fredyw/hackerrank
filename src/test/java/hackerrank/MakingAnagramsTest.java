package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class MakingAnagramsTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream(""));
        MakingAnagrams.main(new String[]{});
    }
}