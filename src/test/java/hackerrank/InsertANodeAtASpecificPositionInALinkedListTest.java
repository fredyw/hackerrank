package hackerrank;

import hackerrank.InsertANodeAtASpecificPositionInALinkedList.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class InsertANodeAtASpecificPositionInALinkedListTest {
    @Test
    public void test1() throws Exception {
        Node node = InsertANodeAtASpecificPositionInALinkedList.insertNth(null, 1, 0);
        assertEquals(1, node.data);
        assertNull(node.next);

        node.next = new Node();
        node.next.data = 2;

        node.next.next = new Node();
        node.next.next.data = 3;

        node = InsertANodeAtASpecificPositionInALinkedList.insertNth(node, 4, 1);
        node = InsertANodeAtASpecificPositionInALinkedList.insertNth(node, 5, 3);
        assertEquals(1, node.data);
        assertEquals(4, node.next.data);
        assertEquals(2, node.next.next.data);
        assertEquals(5, node.next.next.next.data);
        assertEquals(3, node.next.next.next.next.data);
        assertNull(node.next.next.next.next.next);
    }
}