package hackerrank;

/**
 * https://www.hackerrank.com/challenges/get-the-value-of-the-node-at-a-specific-position-from-the-tail
 */
public class GetNodeValue {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static int getNode(Node head, int n) {
        ValPos valPos = getNodeRecurse(head, n);
        return valPos.val;
    }

    private static class ValPos {
        private int val;
        private int pos;
        private boolean found;
    }

    private static ValPos getNodeRecurse(Node head, int n) {
        if (head == null) {
            ValPos valPos = new ValPos();
            valPos.pos = 0;
            return valPos;
        }
        ValPos valPos = getNodeRecurse(head.next, n);
        if (!valPos.found) {
            valPos.val = head.data;
            if (valPos.pos == n) {
                valPos.found = true;
            }
            valPos.pos++;
        }
        return valPos;
    }
}
