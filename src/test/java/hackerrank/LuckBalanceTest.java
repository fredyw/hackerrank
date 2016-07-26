package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class LuckBalanceTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/luck-balance/test1.txt"));
        LuckBalance.main(new String[]{});
    }
}