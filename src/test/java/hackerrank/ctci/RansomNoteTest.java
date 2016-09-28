package hackerrank.ctci;

import org.junit.Test;

import java.io.FileInputStream;

public class RansomNoteTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/ctci/ransom-note/test1.txt"));
        RansomNote.main(new String[]{});
    }
}