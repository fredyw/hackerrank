package hackerrank;

/**
 * https://www.hackerrank.com/challenges/reverse-a-linked-list
 */
public class ReverseALinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    private static class NodeResult {
        Node head;
        Node node;
    }

    public static Node reverse(Node head) {
        NodeResult result = new NodeResult();
        reverse(head, result);
        return result.head;
    }

    public static Node reverse(Node head, NodeResult result) {
        if (head.next == null) {
            result.head = head;
            return head;
        }
        Node node = reverse(head.next, result);
        node.next = head;
        head.next = null;
        return head;
    }
}
