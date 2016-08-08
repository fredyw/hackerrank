package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class FairRationsTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/fair-rations/test1.txt"));
        FairRations.main(new String[]{});
    }

    @Test
    public void test2() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/fair-rations/test2.txt"));
        FairRations.main(new String[]{});
    }

    @Test
    public void test3() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/fair-rations/test3.txt"));
        FairRations.main(new String[]{});
    }
}