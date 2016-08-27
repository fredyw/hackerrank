package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class EmmasSupercomputerTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/emmas-supercomputer/test1.txt"));
        EmmasSupercomputer.main(new String[]{});
    }

    @Test
    public void test2() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/emmas-supercomputer/test2.txt"));
        EmmasSupercomputer.main(new String[]{});
    }
}