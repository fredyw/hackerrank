package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class ServiceLaneTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/service-lane/test1.txt"));
        ServiceLane.main(new String[]{});
    }
}