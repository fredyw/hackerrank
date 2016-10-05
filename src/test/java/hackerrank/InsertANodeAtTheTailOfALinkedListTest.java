package hackerrank;

import hackerrank.InsertANodeAtTheTailOfALinkedList.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class InsertANodeAtTheTailOfALinkedListTest {
    @Test
    public void test1() throws Exception {
        Node head = InsertANodeAtTheTailOfALinkedList.insert(null, 1);
        assertEquals(1, head.data);
        assertNull(head.next);

        head = InsertANodeAtTheTailOfALinkedList.insert(head, 2);
        assertEquals(1, head.data);
        assertEquals(2, head.next.data);
        assertNull(head.next.next);

        head = InsertANodeAtTheTailOfALinkedList.insert(head, 3);
        assertEquals(1, head.data);
        assertEquals(2, head.next.data);
        assertEquals(3, head.next.next.data);
        assertNull(head.next.next.next);
    }
}