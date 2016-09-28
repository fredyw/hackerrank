package hackerrank.ctci;

/**
 * https://www.hackerrank.com/challenges/ctci-is-binary-search-tree
 */
public class IsThisABinarySearchTree {
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public static boolean checkBST(Node root) {
        return checkBST(root, new IntRef());
    }

    private static class IntRef {
        Integer data;
    }

    private static boolean checkBST(Node root, IntRef previous) {
        if (root == null) {
            return true;
        }
        boolean valid1 = checkBST(root.left, previous);
        if (previous.data == null) {
            previous.data = root.data;
        } else {
            if (previous.data >= root.data) {
                return false;
            }
            previous.data = root.data;
        }
        boolean valid2 = checkBST(root.right, previous);
        return valid1 && valid2;
    }
}
