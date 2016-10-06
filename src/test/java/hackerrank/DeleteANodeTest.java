package hackerrank;

import hackerrank.DeleteANode.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class DeleteANodeTest {
    @Test
    public void test1() throws Exception {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        node.next.next.next = new Node(4);

        node = DeleteANode.delete(node, 0);
        assertEquals(2, node.data);
        assertEquals(3, node.next.data);
        assertEquals(4, node.next.next.data);
        assertNull(node.next.next.next);

        node = DeleteANode.delete(node, 2);
        assertEquals(2, node.data);
        assertEquals(3, node.next.data);
        assertNull(node.next.next);

        node = DeleteANode.delete(node, 0);
        assertEquals(3, node.data);
        assertNull(node.next);

        node.next = new Node(4);
        node.next.next = new Node(5);

        node = DeleteANode.delete(node, 1);
        assertEquals(3, node.data);
        assertEquals(5, node.next.data);
        assertNull(node.next.next);
    }
}