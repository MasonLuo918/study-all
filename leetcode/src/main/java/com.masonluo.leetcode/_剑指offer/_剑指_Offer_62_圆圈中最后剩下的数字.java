package com.masonluo.leetcode._剑指offer;

/**
 * @author Masonluo
 * @date 2020-09-25 09:17
 */
public class _剑指_Offer_62_圆圈中最后剩下的数字 {
    public static int lastRemaining(int n, int m) {
        if (n == 1) {
            return 0;
        }
        return (m + lastRemaining(n - 1, m)) % n;
    }

    public static void main(String[] args) {
        System.out.println(lastRemaining(10, 17));
    }
}
