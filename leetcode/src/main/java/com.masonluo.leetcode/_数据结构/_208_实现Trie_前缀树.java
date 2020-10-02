package com.masonluo.leetcode._数据结构;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Masonluo
 * @date 2020-09-30 10:04
 */
public class _208_实现Trie_前缀树 {
    static class Trie {

        private Node root;

        /**
         * Initialize your data structure here.
         */
        public Trie() {
            root = new Node();
        }

        /**
         * Inserts a word into the trie.
         */
        public void insert(String word) {
            Node parent = root;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                Node next = null;
                if (parent.getChildren().containsKey(c)) {
                    next = parent.getChildren().get(c);
                } else {
                    next = new Node(c);
                    parent.getChildren().put(c, next);
                }
                if (i == word.length() - 1) {
                    next.setEnd(true);
                }
                parent = next;
            }
        }

        /**
         * Returns if the word is in the trie.
         */
        public boolean search(String word) {
            Node parent = root;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (!parent.getChildren().containsKey(c)) {
                    return false;
                } else {
                    parent = parent.getChildren().get(c);
                }
            }
            return parent.isEnd || parent.getChildren().size() == 0;
        }

        /**
         * Returns if there is any word in the trie that starts with the given prefix.
         */
        public boolean startsWith(String prefix) {
            Node parent = root;
            for (int i = 0; i < prefix.length(); i++) {
                char c = prefix.charAt(i);
                if (!parent.getChildren().containsKey(c)) {
                    return false;
                } else {
                    parent = parent.getChildren().get(c);
                }
            }
            return true;
        }
    }

    static class Node {
        char val;

        Map<Character, Node> children;

        boolean isEnd;

        public Node() {
            this.children = new HashMap<>();
        }

        public Node(char val) {
            this.val = val;
            this.children = new HashMap<>();
            this.isEnd = false;
        }

        public char getVal() {
            return val;
        }

        public void setVal(char val) {
            this.val = val;
        }

        public Map<Character, Node> getChildren() {
            return children;
        }

        public void setChildren(Map<Character, Node> children) {
            this.children = children;
        }

        public boolean isEnd() {
            return isEnd;
        }

        public void setEnd(boolean end) {
            isEnd = end;
        }
    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        System.out.println(trie.search("apple"));
        System.out.println(trie.search("app"));
        System.out.println(trie.startsWith("app"));
        trie.insert("app");
        System.out.println(trie.search("app"));
    }
}
