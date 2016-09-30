package hackerrank.ctci;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/ctci-contacts
 */
public class Contacts {
    private static class Node {
        private final Map<Character, Node> children = new HashMap<>();
        private boolean word;
    }

    private static class IntRef {
        int count;
    }

    private static class Trie {
        private Node root = new Node();

        public void add(String str) {
            add(str, root, 0);
        }

        private static void add(String str, Node node, int idx) {
            if (idx == str.length()) {
                return;
            }
            char c = str.charAt(idx);
            if (node.children.containsKey(c)) {
                Node child = node.children.get(c);
                if (str.length() - 1 == idx) {
                    child.word = true;
                }
                add(str, child, idx + 1);
            } else {
                Node newNode = new Node();
                if (str.length() - 1 == idx) {
                    newNode.word = true;
                }
                node.children.put(c, newNode);
                add(str, newNode, idx + 1);
            }
        }

        private int find(String str) {
            IntRef ref = new IntRef();
            find(str, root, 0, ref);
            return ref.count;
        }

        private static void find(String str, Node node, int idx, IntRef ref) {
            if (idx == str.length()) {
                allChildren(node, ref);
                return;
            }
            char c = str.charAt(idx);
            if (node.children.containsKey(c)) {
                Node child = node.children.get(c);
                if (idx == str.length() - 1 && child.word) {
                    ref.count++;
                }
                find(str, child, idx + 1, ref);
            }
        }

        private static void allChildren(Node node, IntRef ref) {
            if (node == null) {
                return;
            }
            for (Map.Entry<Character, Node> child : node.children.entrySet()) {
                Node cn = child.getValue();
                if (cn.word) {
                    ref.count++;
                }
                allChildren(cn, ref);
            }
        }
    }

    private static void contact(Trie trie, String op, String contact) {
        if (op.equals("find")) {
            System.out.println(trie.find(contact));
        } else if (op.equals("add")) {
            trie.add(contact);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Trie trie = new Trie();
        for (int a0 = 0; a0 < n; a0++) {
            String op = in.next();
            String contact = in.next();
            contact(trie, op, contact);
        }
    }
}
