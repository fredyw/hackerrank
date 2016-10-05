package hackerrank;

/**
 * https://www.hackerrank.com/challenges/insert-a-node-at-the-tail-of-a-linked-list
 */
public class InsertANodeAtTheTailOfALinkedList {
    public static class Node {
        int data;
        Node next;
    }

    public static Node insert(Node head, int data) {
        if (head == null) {
            Node newNode = new Node();
            newNode.data = data;
            return newNode;
        }
        Node node = head;
        Node prev = null;
        while (node != null) {
            prev = node;
            node = node.next;
        }
        Node newNode = new Node();
        newNode.data = data;
        prev.next = newNode;
        return head;
    }
}
