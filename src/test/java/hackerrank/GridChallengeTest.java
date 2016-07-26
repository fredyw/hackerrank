package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class GridChallengeTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/grid-challenge/test1.txt"));
        GridChallenge.main(new String[]{});
    }
}