package com.masonluo.leetcode._剑指offer;

/**
 * @author Masonluo
 * @date 2020-09-20 09:41
 */
public class _剑指Offer44_数字序列中某一位的数字 {
    public static int findNthDigit(int n) {
        int digit = 1;
        long start = 1;
        long count = 9;
        while (n > count) { // 1.
            n -= count;
            digit += 1;
            start *= 10;
            count = digit * start * 9;
        }
        long num = start + (n - 1) / digit;
        return Long.toString(num).charAt((n - 1) % digit) - '0';
    }

    public static void main(String[] args) {
        System.out.println("10".compareTo(""));
    }
}
