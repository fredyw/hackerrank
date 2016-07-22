package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class SnakesAndLaddersTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/snakes-and-ladders/test1.txt"));
        SnakesAndLadders.main(new String[]{});
    }
}