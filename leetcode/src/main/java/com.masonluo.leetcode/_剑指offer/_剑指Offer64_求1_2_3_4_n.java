package com.masonluo.leetcode._剑指offer;

/**
 * @author Masonluo
 * @date 2020-09-24 10:11
 */
public class _剑指Offer64_求1_2_3_4_n {
    public int sumNums(int n) {
        boolean flag = n > 0 && (n += sumNums(n - 1) ) >= 0;
        return n;
    }
}
