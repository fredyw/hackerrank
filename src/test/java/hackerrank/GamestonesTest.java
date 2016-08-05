package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class GamestonesTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/gamestones/test1.txt"));
        Gamestones.main(new String[]{});
    }
}