package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class CavityMapTest {
    @Test
    public void test1() throws Exception {
       System.setIn(new FileInputStream("src/test/resources/cavity-map/test1.txt"));
        CavityMap.main(new String[]{});
    }
}