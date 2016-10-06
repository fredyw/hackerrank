package hackerrank;

import hackerrank.MergeTwoSortedLinkedLists.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class MergeTwoSortedLinkedListsTest {
    @Test
    public void test1() throws Exception {
        Node node1 = new Node(1);
        node1.next = new Node(3);
        node1.next.next = new Node(4);
        node1.next.next.next = new Node(6);

        Node node2 = new Node(2);
        node2.next = new Node(5);
        node2.next.next = new Node(7);

        Node node = MergeTwoSortedLinkedLists.mergeLists(node1, node2);
        assertEquals(1, node.data);
        assertEquals(2, node.next.data);
        assertEquals(3, node.next.next.data);
        assertEquals(4, node.next.next.next.data);
        assertEquals(5, node.next.next.next.next.data);
        assertEquals(6, node.next.next.next.next.next.data);
        assertEquals(7, node.next.next.next.next.next.next.data);
        assertNull(node.next.next.next.next.next.next.next);

        node1 = new Node(1);
        node1.next = new Node(3);
        node1.next.next = new Node(4);
        node1.next.next.next = new Node(6);

        node2 = new Node(2);
        node2.next = new Node(5);
        node2.next.next = new Node(7);

        node = MergeTwoSortedLinkedLists.mergeLists(node2, node1);
        assertEquals(1, node.data);
        assertEquals(2, node.next.data);
        assertEquals(3, node.next.next.data);
        assertEquals(4, node.next.next.next.data);
        assertEquals(5, node.next.next.next.next.data);
        assertEquals(6, node.next.next.next.next.next.data);
        assertEquals(7, node.next.next.next.next.next.next.data);
        assertNull(node.next.next.next.next.next.next.next);

        node1 = new Node(1);
        node1.next = new Node(3);
        node1.next.next = new Node(4);
        node1.next.next.next = new Node(6);

        node = MergeTwoSortedLinkedLists.mergeLists(node1, null);
        assertEquals(1, node.data);
        assertEquals(3, node.next.data);
        assertEquals(4, node.next.next.data);
        assertEquals(6, node.next.next.next.data);
        assertNull(node.next.next.next.next);
    }
}