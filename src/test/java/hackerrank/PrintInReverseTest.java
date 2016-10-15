package hackerrank;

import hackerrank.PrintInReverse.Node;
import org.junit.Test;

public class PrintInReverseTest {
    @Test
    public void test1() throws Exception {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        PrintInReverse.reversePrint(head);
    }
}