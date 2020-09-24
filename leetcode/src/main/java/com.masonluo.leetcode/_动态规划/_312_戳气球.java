package com.masonluo.leetcode._动态规划;

/**
 * @author Masonluo
 * @date 2020-09-24 20:28
 */
public class _312_戳气球 {
    public static int maxCoins(int[] nums) {
        int len = nums.length;
        int[] point = new int[len + 2];
        point[0] = point[len + 1] = 1;
        int[][] dp = new int[len + 2][len + 2];
        for (int i = 0; i < nums.length; i++) {
            point[i + 1] = nums[i];
        }
        for (int i = 0; i < dp.length; i++) {
            dp[i][i] = 0;
        }
        int newLen = len + 2;
        for (int i = point.length - 2; i >= 0; i--) {
            for (int j = i + 1; j < len + 2; j++) {
                for (int k = i + 1; k < j; k++) {
                    dp[i][j] = Math.max(dp[i][j], dp[i][k] + dp[k][j] + point[i] * point[k] * point[j]);
                }
            }
        }
        return dp[0][newLen - 1];
    }

    public static void main(String[] args) {
        System.out.println(maxCoins(new int[]{3, 1, 5, 8}));
    }

}
