package hackerrank;

/**
 * https://www.hackerrank.com/challenges/merge-two-sorted-linked-lists
 */
public class MergeTwoSortedLinkedLists {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static Node mergeLists(Node headA, Node headB) {
        Node head = null;
        Node node = null;
        Node node1 = headA;
        Node node2 = headB;
        if (node1 == null) {
            return node2;
        } else if (node2 == null) {
            return node1;
        }
        while (node1 != null && node2 != null) {
            if (node1.data < node2.data) {
                if (head == null) {
                    head = node1;
                    node = head;
                } else {
                    Node next = node1.next;
                    node1.next = null;
                    node.next = node1;
                    node = node.next;
                    node1 = next;
                }
            } else {
                if (head == null) {
                    head = node2;
                    node = head;
                } else {
                    Node next = node2.next;
                    node2.next = null;
                    node.next = node2;
                    node = node.next;
                    node2 = next;
                }
            }
        }
        if (node1 != null) {
            node.next = node1;
        } else {
            node.next = node2;
        }
        return head;
    }
}
