package hackerrank;

/**
 * https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list-in-reverse
 */
public class PrintInReverse {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void reversePrint(Node head) {
        if (head == null) {
            return;
        }
        reversePrint(head.next);
        if (head != null) {
            System.out.println(head.data);
        }
    }
}
