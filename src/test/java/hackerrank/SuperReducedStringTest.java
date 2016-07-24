package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class SuperReducedStringTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/super-reduced-string/test1.txt"));
        SuperReducedString.main(new String[]{});
    }

    @Test
    public void test2() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/super-reduced-string/test2.txt"));
        SuperReducedString.main(new String[]{});
    }

    @Test
    public void test3() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/super-reduced-string/test3.txt"));
        SuperReducedString.main(new String[]{});
    }

    @Test
    public void test4() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/super-reduced-string/test4.txt"));
        SuperReducedString.main(new String[]{});
    }

    @Test
    public void test5() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/super-reduced-string/test5.txt"));
        SuperReducedString.main(new String[]{});
    }

    @Test
    public void test6() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/super-reduced-string/test6.txt"));
        SuperReducedString.main(new String[]{});
    }
}