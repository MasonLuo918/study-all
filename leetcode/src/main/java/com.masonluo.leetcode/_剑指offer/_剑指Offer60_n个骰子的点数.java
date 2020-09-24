package com.masonluo.leetcode._剑指offer;

import java.util.Arrays;

/**
 * @author Masonluo
 * @date 2020-09-24 09:26
 */
public class _剑指Offer60_n个骰子的点数 {
    public static double[] twoSum(int n) {
        int len = 6 * n + 1;
        int[][] dp = new int[n + 1][len];
        for (int i = 1; i <= 6; i++) {
            dp[1][i] = 1;
        }
        for (int i = 2; i <= n; i++) {
            for (int j = i; j <= 6 * i; j++) {
                for (int k = 1; k <= 6; k++) {
                    dp[i][j] = j - k > 0 ? dp[i][j] + dp[i - 1][j - k] : dp[i][j];
                }
            }
        }
        double all = Math.pow(6, n);
        double[] result = new double[6 * n - n + 1];
        int t = 0;
        for (int i = n; i <= 6 * n; i++) {
            result[t++] = dp[n][i] / all;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(2)));
    }
}
