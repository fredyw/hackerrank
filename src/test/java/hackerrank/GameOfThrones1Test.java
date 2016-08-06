package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class GameOfThrones1Test {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/game-of-thrones1/test1.txt"));
        GameOfThrones1.main(new String[]{});
    }

    @Test
    public void test2() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/game-of-thrones1/test2.txt"));
        GameOfThrones1.main(new String[]{});
    }

    @Test
    public void test3() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/game-of-thrones1/test3.txt"));
        GameOfThrones1.main(new String[]{});
    }
}