package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class KnapsackTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/knapsack/test1.txt"));
        Knapsack.main(new String[]{});
    }

    @Test
    public void test2() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/knapsack/test2.txt"));
        Knapsack.main(new String[]{});
    }
}