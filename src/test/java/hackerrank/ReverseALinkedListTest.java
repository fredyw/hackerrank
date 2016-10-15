package hackerrank;

import hackerrank.ReverseALinkedList.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseALinkedListTest {
    @Test
    public void test1() throws Exception {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        head = ReverseALinkedList.reverse(head);
        assertEquals(5, head.data);
        assertEquals(4, head.next.data);
        assertEquals(3, head.next.next.data);
        assertEquals(2, head.next.next.next.data);
        assertEquals(1, head.next.next.next.next.data);
    }
}