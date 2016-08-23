package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class GreedyFloristTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/greedy-florist/test1.txt"));
        GreedyFlorist.main(new String[]{});
    }

    @Test
    public void test2() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/greedy-florist/test2.txt"));
        GreedyFlorist.main(new String[]{});
    }

    @Test
    public void test3() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/greedy-florist/test3.txt"));
        GreedyFlorist.main(new String[]{});
    }

    @Test
    public void test4() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/greedy-florist/test4.txt"));
        GreedyFlorist.main(new String[]{});
    }

    @Test
    public void test5() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/greedy-florist/test5.txt"));
        GreedyFlorist.main(new String[]{});
    }
}