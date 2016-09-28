package hackerrank.ctci;

import hackerrank.ctci.DetectACycle.Node;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DetectACycleTest {
    @Test
    public void test1() {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        node.next.next.next = node;

        assertTrue(DetectACycle.hasCycle(node));
    }

    @Test
    public void test2() {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);

        assertFalse(DetectACycle.hasCycle(node));
    }
}