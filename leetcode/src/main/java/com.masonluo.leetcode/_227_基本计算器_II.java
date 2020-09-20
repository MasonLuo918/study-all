package com.masonluo.leetcode;

import java.util.Stack;

/**
 * @author Masonluo
 * @date 2020-09-14 09:33
 */
public class _227_基本计算器_II {

    public static int calculate(String s) {
        return calculate(s.toCharArray(), new int[]{0});
    }

    public static int calculate(char[] str, int[] startIndex) {
        Stack<Integer> stack = new Stack<>();
        char sign = '+';
        int num = 0;
        int temp;
        for (; startIndex[0] < str.length; startIndex[0]++) {
            char c = str[startIndex[0]];
            if (isDigit(c)) {
                num = num * 10 + (c - '0');
            }
            if (c == '(') {
                startIndex[0]++;
                num = calculate(str, startIndex);
            }
            if ((!isDigit(c) && c !=' ') || startIndex[0] == str.length - 1) {
                switch (sign) {
                    case '+':
                        stack.push(num);
                        break;
                    case '-':
                        stack.push(-num);
                        break;
                    case '*':
                        temp = stack.pop();
                        num = num * temp;
                        stack.push(num);
                        break;
                    case '/':
                        temp = stack.pop();
                        num = temp / num;
                        stack.push(num);
                        break;
                }
                sign = c;
                num = 0;
            }
            if (c == ')') {
                break;
            }
        }
        int res = 0;
        while (!stack.isEmpty()) {
            res += stack.pop();
        }
        return res;
    }

    static boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }

    public static void main(String[] args) {
        System.out.println(calculate(" 3/2 "));
    }
}
