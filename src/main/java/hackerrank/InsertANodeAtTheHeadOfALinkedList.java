package hackerrank;

/**
 * https://www.hackerrank.com/challenges/insert-a-node-at-the-head-of-a-linked-list
 */
public class InsertANodeAtTheHeadOfALinkedList {
    public static class Node {
        int data;
        Node next;
    }

    public static Node insert(Node head, int x) {
        Node newHead = new Node();
        newHead.data = x;
        newHead.next = head;
        return newHead;
    }
}
