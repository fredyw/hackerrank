package hackerrank;

import hackerrank.InsertANodeAtTheHeadOfALinkedList.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class InsertANodeAtTheHeadOfALinkedListTest {
    @Test
    public void test1() throws Exception {
        Node head = InsertANodeAtTheHeadOfALinkedList.insert(null, 1);
        assertEquals(1, head.data);
        assertNull(head.next);

        head = InsertANodeAtTheHeadOfALinkedList.insert(head, 2);
        assertEquals(2, head.data);
        assertEquals(1, head.next.data);
        assertNull(head.next.next);

        head = InsertANodeAtTheHeadOfALinkedList.insert(head, 3);
        assertEquals(3, head.data);
        assertEquals(2, head.next.data);
        assertEquals(1, head.next.next.data);
        assertNull(head.next.next.next);
    }
}