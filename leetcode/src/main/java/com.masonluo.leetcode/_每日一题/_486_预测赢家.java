package com.masonluo.leetcode._每日一题;

/**
 * @author Masonluo
 * @date 2020-09-01 16:58
 */
public class _486_预测赢家 {
    public static boolean PredictTheWinner(int[] nums) {
        int len = nums.length;
        int[][] dp = new int[len][len];
        for (int i = 0; i < len; i++) {
            dp[i][i] = nums[i];
        }

        for (int i = len - 2; i >= 0; i--) {
            for (int j = i + 1; j < len; j++) {
                int pickI = nums[i] - dp[i + 1][j];
                int pickJ = nums[j] - dp[i][j - 1];
                dp[i][j] = Math.max(pickI, pickJ);
            }
        }
        return dp[0][len - 1] >= 0;
    }

    public static void main(String[] args) {
        System.out.println(PredictTheWinner(new int[]{1, 5, 233, 7}));
    }
}
