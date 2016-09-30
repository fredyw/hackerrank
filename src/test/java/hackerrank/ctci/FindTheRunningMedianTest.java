package hackerrank.ctci;

import org.junit.Test;

import java.io.FileInputStream;

public class FindTheRunningMedianTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/ctci/find-the-running-median/test1.txt"));
        FindTheRunningMedian.main(new String[]{});
    }
}