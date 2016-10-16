package hackerrank;

import hackerrank.GetNodeValue.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GetNodeValueTest {
    @Test
    public void test1() throws Exception {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        assertEquals(5, GetNodeValue.getNode(head, 0));
        assertEquals(4, GetNodeValue.getNode(head, 1));
        assertEquals(3, GetNodeValue.getNode(head, 2));
        assertEquals(2, GetNodeValue.getNode(head, 3));
        assertEquals(1, GetNodeValue.getNode(head, 4));
    }
}