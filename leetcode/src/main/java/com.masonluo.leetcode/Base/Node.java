package com.masonluo.leetcode.Base;

/**
 * @author Masonluo
 * @date 2020-09-04 15:49
 */
public class Node {
    public int val;
    public Node next;
    public Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}