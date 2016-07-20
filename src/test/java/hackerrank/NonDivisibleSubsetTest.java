package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

/**
 * @author fredy <fredy.wijaya@amd.com>
 */
public class NonDivisibleSubsetTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/non-divisible-subset/test1.txt"));
        NonDivisibleSubset.main(new String[]{});
    }
}