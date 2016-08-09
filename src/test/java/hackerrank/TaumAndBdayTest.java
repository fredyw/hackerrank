package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class TaumAndBdayTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/taum-and-bday/test1.txt"));
        TaumAndBday.main(new String[]{});
    }
}