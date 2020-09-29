package com.masonluo.leetcode._每日一题;


import java.util.LinkedList;

/**
 * @author Masonluo
 * @date 2020-09-28 11:04
 */
public class _117_填充每个节点的下一个右侧节点指针_II {

    static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    public static Node connect(Node root) {
        bfs(root);
        return root;
    }

    public static void bfs(Node root) {
        if (root == null) {
            return;
        }
        LinkedList<Node> queue = new LinkedList<>();
        queue.addLast(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node tmpNode = queue.removeFirst();
                if (tmpNode.left != null){
                    queue.addLast(tmpNode.left);
                }
                if (tmpNode.right != null){
                    queue.addLast(tmpNode.right);
                }
                if (i != size - 1) {
                    tmpNode.next = queue.getFirst();
                }
            }
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.right = new Node(7);
        Node res = connect(root);
    }
}
