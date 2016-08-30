package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class TheBombermanGameTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/the-bomberman-game/test1.txt"));
        TheBombermanGame.main(new String[]{});
    }

    @Test
    public void test2() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/the-bomberman-game/test2.txt"));
        TheBombermanGame.main(new String[]{});
    }

    @Test
    public void test3() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/the-bomberman-game/test3.txt"));
        TheBombermanGame.main(new String[]{});
    }
}