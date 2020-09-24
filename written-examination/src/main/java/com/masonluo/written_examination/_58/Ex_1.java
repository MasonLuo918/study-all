package com.masonluo.written_examination._58;

import java.util.Stack;

/**
 * @author Masonluo
 * @date 2020-09-21 20:20
 */
public class Ex_1 {
    public int calculate(String input) {
        Stack<Integer> stack = new Stack<Integer>();
        int num = 0;
        char sign = '+';
        char[] expre = input.toCharArray();
        int i = 0;
        while (i < expre.length) {
            char c = expre[i];
            if (c == ' ') {
                i++;
                continue;
            }
            if (c >= '0' && c <= '9') {
                num = 0;
                while (i < expre.length && (((c = expre[i]) >= '0' && c <= '9') || c == ' ')) {
                    if (c != ' ') {
                        num = num * 10 + (c - '0');
                    }
                    i++;
                }
            }

            switch (sign) {
                case '+':
                    stack.push(num);
                    break;
                case '-':
                    stack.push(-num);
                    break;
                case '*':
                    int mul = stack.pop() * num;
                    stack.push(mul);
                    break;
                case '/':
                    int div = stack.pop() / num;
                    stack.push(div);
                    break;
            }
            sign = c;
            i++;
        }

        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }
        return sum;
    }

    public static void main(String[] args) {
        Ex_1 ex_1 = new Ex_1();
        System.out.println(ex_1.calculate("-11 * 2"));
    }
}
