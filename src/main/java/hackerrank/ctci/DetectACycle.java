package hackerrank.ctci;

/**
 * https://www.hackerrank.com/challenges/ctci-linked-list-cycle
 */
public class DetectACycle {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static boolean hasCycle(Node head) {
        Node n1 = head;
        Node n2 = head;
        while (true) {
            if (n1 == null || n2 == null) {
                return false;
            }
            n1 = n1.next;
            if (n2.next == null) {
                return false;
            }
            n2 = n2.next.next;
            if (n1 == n2) {
                return true;
            }
        }
    }
}
