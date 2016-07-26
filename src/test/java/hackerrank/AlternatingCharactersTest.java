package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class AlternatingCharactersTest {
    @Test
    public void test1() throws Exception{
        System.setIn(new FileInputStream("src/test/resources/alternating-characters/test1.txt"));
        AlternatingCharacters.main(new String[]{});
    }
}