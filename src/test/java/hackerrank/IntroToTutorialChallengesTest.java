package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class IntroToTutorialChallengesTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/intro-to-tutorial-challenges/test1.txt"));
        IntroToTutorialChallenges.main(new String[]{});
    }
}