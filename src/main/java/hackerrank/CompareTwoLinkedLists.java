package hackerrank;

/**
 * https://www.hackerrank.com/challenges/compare-two-linked-lists
 */
public class CompareTwoLinkedLists {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static int compareLists(Node headA, Node headB) {
        Node n1;
        Node n2;
        for (n1 = headA, n2 = headB; n1 != null && n2 != null; n1 = n1.next, n2 = n2.next) {
            if (n1.data != n2.data) {
                return 0;
            }
        }
        return (n1 == null && n2 == null) ? 1 : 0;
    }
}
