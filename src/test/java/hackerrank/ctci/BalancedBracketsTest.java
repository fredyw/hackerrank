package hackerrank.ctci;

import org.junit.Test;

import java.io.FileInputStream;

public class BalancedBracketsTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/ctci/balanced-brackets/test1.txt"));
        BalancedBrackets.main(new String[]{});
    }

    @Test
    public void test2() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/ctci/balanced-brackets/test2.txt"));
        BalancedBrackets.main(new String[]{});
    }
}