package com.masonluo.leetcode._剑指offer;

/**
 * @author Masonluo
 * @date 2020-09-21 10:05
 */
public class _剑指Offer_49丑数 {
    public static int nthUglyNumber(int n) {
        int[] dp = new int[n];
        dp[0] = 1;
        int last_2 = 0, last_3 = 0, last_5 = 0;
        int size = 1;
        while (size < n) {
            int n2 = dp[last_2] * 2;
            int n3 = dp[last_3] * 3;
            int n5 = dp[last_5] * 5;
            int num = Math.min(Math.min(n2, n3), n5);
            dp[size++] = num;
            if (num == dp[last_2] * 2) last_2++;
            if (num == dp[last_3] * 3) last_3++;
            if (num == dp[last_5] * 5) last_5++;
        }
        return dp[n - 1];
    }

    public static void main(String[] args) {
        System.out.println(nthUglyNumber(10));
    }
}
