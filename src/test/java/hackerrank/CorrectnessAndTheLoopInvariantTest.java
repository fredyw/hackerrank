package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class CorrectnessAndTheLoopInvariantTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/correctness-and-the-loop-invariant/test1.txt"));
        CorrectnessAndTheLoopInvariant.main(new String[]{});
    }

    @Test
    public void test2() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/correctness-and-the-loop-invariant/test2.txt"));
        CorrectnessAndTheLoopInvariant.main(new String[]{});
    }
}