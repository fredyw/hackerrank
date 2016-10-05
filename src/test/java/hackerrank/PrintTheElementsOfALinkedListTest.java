package hackerrank;

import hackerrank.PrintTheElementsOfALinkedList.Node;
import org.junit.Test;

public class PrintTheElementsOfALinkedListTest {
    @Test
    public void test1() throws Exception {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        PrintTheElementsOfALinkedList.print(node);
    }
}