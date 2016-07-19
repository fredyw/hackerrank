package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class AngryProfessorTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/angry-professor/test1.txt"));
        AngryProfessor.main(new String[]{});
    }
}