package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class RunningTimeOfTheAlgorithmsTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/running-time-of-the-algorithms/test1.txt"));
        RunningTimeOfTheAlgorithms.main(new String[]{});
    }
}