package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/contacts
 */
public class Contacts {
    private static class Node {
        private final Contacts.Node[] children = new Contacts.Node[26];
        private boolean word;
        private int count;
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
            if (node.children[c - 'a'] != null) {
                Node child = node.children[c - 'a'];
                if (str.length() - 1 == idx) {
                    child.word = true;
                    child.count++;
                }
                add(str, child, idx + 1);
                node.count++;
            } else {
                Node newNode = new Node();
                if (str.length() - 1 == idx) {
                    newNode.word = true;
                    newNode.count++;
                }
                node.children[c - 'a'] = newNode;
                add(str, newNode, idx + 1);
                node.count++;
            }
        }

        private int find(String str) {
            IntRef ref = new IntRef();
            find(str, root, 0, ref);
            return ref.count;
        }

        private static void find(String str, Node node, int idx, IntRef ref) {
            if (idx == str.length()) {
                ref.count = node.count;
                return;
            }
            char c = str.charAt(idx);
            if (node.children[c - 'a'] != null) {
                Node child = node.children[c - 'a'];
                if (idx == str.length() - 1 && child.word) {
                    ref.count++;
                }
                find(str, child, idx + 1, ref);
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
