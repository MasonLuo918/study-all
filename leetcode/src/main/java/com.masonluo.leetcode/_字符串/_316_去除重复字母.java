package com.masonluo.leetcode._字符串;

import java.util.Stack;

/**
 * @author Masonluo
 * @date 2020-09-26 10:44
 */
public class _316_去除重复字母 {
    public static String removeDuplicateLetters(String s) {
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            count[c - 'a']++;
        }
        Stack<Character> stack = new Stack<>();
        boolean[] inStack = new boolean[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            count[c - 'a']--;
            if (inStack[c - 'a']) continue;
            while (!stack.isEmpty() && stack.peek() > c) {
                if (count[stack.peek() - 'a'] == 0) {
                    break;
                }
                inStack[stack.pop() - 'a'] = false;
            }
            stack.push(c);
            inStack[c - 'a'] = true;
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicateLetters("cbac"));
    }
}
