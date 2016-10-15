package hackerrank;

import hackerrank.CompareTwoLinkedLists.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CompareTwoLinkedListsTest {
    @Test
    public void test1() throws Exception {
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);

        Node head2 = new Node(1);
        head2.next = new Node(2);
        head2.next.next = new Node(3);

        assertEquals(1, CompareTwoLinkedLists.compareLists(head1, head2));

        head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);

        head2 = new Node(1);
        head2.next = new Node(2);
        head2.next.next = new Node(3);

        assertEquals(0, CompareTwoLinkedLists.compareLists(head1, head2));
        assertEquals(0, CompareTwoLinkedLists.compareLists(head2, head1));
    }
}