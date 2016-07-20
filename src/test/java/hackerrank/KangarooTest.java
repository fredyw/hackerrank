package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class KangarooTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/kangaroo/test1.txt"));
        Kangaroo.main(new String[]{});
    }

    @Test
    public void test2() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/kangaroo/test2.txt"));
        Kangaroo.main(new String[]{});
    }

    @Test
    public void test3() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/kangaroo/test3.txt"));
        Kangaroo.main(new String[]{});
    }

    @Test
    public void test4() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/kangaroo/test4.txt"));
        Kangaroo.main(new String[]{});
    }

    @Test
    public void test5() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/kangaroo/test5.txt"));
        Kangaroo.main(new String[]{});
    }
}