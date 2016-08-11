package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class FlatlandSpaceStationTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/flatland-space-station/test1.txt"));
        FlatlandSpaceStation.main(new String[]{});
    }

    @Test
    public void test2() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/flatland-space-station/test2.txt"));
        FlatlandSpaceStation.main(new String[]{});
    }

    @Test
    public void test3() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/flatland-space-station/test3.txt"));
        FlatlandSpaceStation.main(new String[]{});
    }
}