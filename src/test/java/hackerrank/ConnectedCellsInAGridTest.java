package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class ConnectedCellsInAGridTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/connected-cells-in-a-grid/test1.txt"));
        ConnectedCellsInAGrid.main(new String[]{});
    }
}