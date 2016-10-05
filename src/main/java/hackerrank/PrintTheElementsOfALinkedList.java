package hackerrank;

/**
 * https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list
 */
public class PrintTheElementsOfALinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void print(Node head) {
        for (Node node = head; node != null; node = node.next) {
            System.out.println(node.data);
        }
    }
}
