package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class IceCreamParlorTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/ice-cream-parlor/test1.txt"));
        IceCreamParlor.main(new String[]{});
    }
}