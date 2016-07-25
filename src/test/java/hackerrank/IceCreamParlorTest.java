package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class IceCreamParlorTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/ice-cream-parlor/test1.txt"));
        IceCreamParlor.main(new String[]{});
    }

    @Test
    public void test2() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/ice-cream-parlor/test2.txt"));
        IceCreamParlor.main(new String[]{});
    }

    @Test
    public void test3() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/ice-cream-parlor/test3.txt"));
        IceCreamParlor.main(new String[]{});
    }
}