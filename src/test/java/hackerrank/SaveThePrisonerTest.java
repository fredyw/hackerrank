package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class SaveThePrisonerTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/save-the-prisoner/test1.txt"));
        SaveThePrisoner.main(new String[]{});
    }
}