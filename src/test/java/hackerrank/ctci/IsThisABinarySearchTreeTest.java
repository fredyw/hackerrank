package hackerrank.ctci;

import hackerrank.ctci.IsThisABinarySearchTree.Node;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsThisABinarySearchTreeTest {
    @Test
    public void test1() throws Exception {
        Node root = new Node(5);
        root.left = new Node(3);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right = new Node(6);
        assertTrue(IsThisABinarySearchTree.checkBST(root));
    }

    @Test
    public void test2() throws Exception {
        Node root = new Node(5);
        root.left = new Node(3);
        root.left.left = new Node(2);
        root.left.right = new Node(7);
        root.right = new Node(6);
        assertFalse(IsThisABinarySearchTree.checkBST(root));
    }
}