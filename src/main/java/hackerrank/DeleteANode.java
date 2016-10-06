package hackerrank;

/**
 * https://www.hackerrank.com/challenges/delete-a-node-from-a-linked-list
 */
public class DeleteANode {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static Node delete(Node head, int position) {
        if (head == null) {
            return head;
        }
        if (position == 0) {
            return head.next;
        }
        int i = 0;
        Node prev = null;
        for (Node node = head; node != null; node = node.next) {
            if (i == position) {
                if (prev != null) {
                    prev.next = node.next;
                }
            }
            prev = node;
            i++;
        }
        return head;
    }
}
