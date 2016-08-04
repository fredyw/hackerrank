package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class LisaWokbookTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/lisa-workbook/test1.txt"));
        LisaWokbook.main(new String[]{});
    }
}