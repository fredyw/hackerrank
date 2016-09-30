package hackerrank.ctci;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

        private List<String> find(String str) {
            List<String> words = new ArrayList<>();
            find(str, root, 0, "", words);
            return words;
        }

        private static void find(String str, Node node, int idx, String word,
                                 List<String> words) {
            if (idx == str.length()) {
                allChildren(node, word, words);
                return;
            }
            char c = str.charAt(idx);
            if (node.children.containsKey(c)) {
                Node child = node.children.get(c);
                if (idx == str.length() - 1 && child.word) {
                    words.add(word + c);
                }
                find(str, child, idx + 1, word + c, words);
            }
        }

        private static void allChildren(Node node, String word, List<String> words) {
            if (node == null) {
                return;
            }
            for (Map.Entry<Character, Node> child : node.children.entrySet()) {
                char c = child.getKey();
                Node cn = child.getValue();
                if (cn.word) {
                    words.add(word + c);
                }
                allChildren(cn, word + c, words);
            }
        }
    }

    private static void contact(Trie trie, String op, String contact) {
        if (op.equals("find")) {
            System.out.println(trie.find(contact).size());
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
