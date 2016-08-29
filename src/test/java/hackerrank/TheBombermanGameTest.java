package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class TheBombermanGameTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/the-bomberman-game/test1.txt"));
        TheBombermanGame.main(new String[]{});
    }
}