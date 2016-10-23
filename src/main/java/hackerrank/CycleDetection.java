package hackerrank;

/**
 * https://www.hackerrank.com/challenges/detect-whether-a-linked-list-contains-a-cycle
 */
public class CycleDetection {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static boolean hasCycle(Node head) {
        Node oneStep = head;
        Node twoSteps = head;
        while (oneStep != null && twoSteps != null) {
            oneStep = oneStep.next;
            if (twoSteps.next == null) {
                return false;
            }
            twoSteps = twoSteps.next.next;
            if (oneStep == twoSteps) {
                return true;
            }
        }
        return false;
    }
}
