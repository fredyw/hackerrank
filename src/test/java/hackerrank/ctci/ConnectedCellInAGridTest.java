package hackerrank.ctci;

import org.junit.Test;

import java.io.FileInputStream;

public class ConnectedCellInAGridTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/ctci/connected-cell-in-a-grid/test1.txt"));
        ConnectedCellInAGrid.main(new String[]{});
    }
}