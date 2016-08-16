package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class QuickSort1PartitionTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/quicksort1-partition/test1.txt"));
        QuickSort1Partition.main(new String[]{});
    }
}