package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class ChocolateFeastTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/chocolate-feast/test1.txt"));
        ChocolateFeast.main(new String[]{});
    }
}