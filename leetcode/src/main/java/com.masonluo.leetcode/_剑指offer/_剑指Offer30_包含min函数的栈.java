package com.masonluo.leetcode._剑指offer;

import java.util.Stack;

/**
 * @author Masonluo
 * @date 2020-09-04 15:14
 */
public class _剑指Offer30_包含min函数的栈 {

    private Stack<Integer> stack = new Stack<>();

    private Stack<Integer> minStack = new Stack<>();

    /**
     * initialize your data structure here.
     */
    public _剑指Offer30_包含min函数的栈() {

    }

    public void push(int x) {
        stack.push(x);
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    public void pop() {
        int num = stack.pop();
        if (num == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}
