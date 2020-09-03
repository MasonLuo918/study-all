package com.masonluo.leetcode._剑指offer;

import java.util.Stack;

/**
 * @author Masonluo
 * @date 2020-09-03 08:58
 */
public class _剑指Offer_栈的压入弹出序列 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        for (int num : pushed) {
            stack.push(num);
            while (!stack.isEmpty() && stack.peek() == popped[i]) {
                stack.pop();
                i++;
            }
        }
        return stack.isEmpty();
    }
}
