package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class JimAndTheOrdersTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/jim-and-the-orders/test1.txt"));
        JimAndTheOrders.main(new String[]{});
    }

    @Test
    public void test2() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/jim-and-the-orders/test2.txt"));
        JimAndTheOrders.main(new String[]{});
    }
}