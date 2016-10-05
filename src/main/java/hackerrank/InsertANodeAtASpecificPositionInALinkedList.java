package hackerrank;

/**
 * https://www.hackerrank.com/challenges/insert-a-node-at-a-specific-position-in-a-linked-list
 */
public class InsertANodeAtASpecificPositionInALinkedList {
    public static class Node {
        int data;
        Node next;
    }

    public static Node insertNth(Node head, int data, int position) {
        if (position == 0) {
            Node newNode = new Node();
            newNode.data = data;
            newNode.next = head;
            return newNode;
        }
        int i = 0;
        for (Node node = head; node != null; node = node.next) {
            if (i == position - 1) {
                Node newNode = new Node();
                newNode.data = data;
                Node tmp = node.next;
                node.next = newNode;
                newNode.next = tmp;
                break;
            }
            i++;
        }
        return head;
    }
}
