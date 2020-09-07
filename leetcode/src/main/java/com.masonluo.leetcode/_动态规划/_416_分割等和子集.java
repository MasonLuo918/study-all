package com.masonluo.leetcode._动态规划;

/**
 * @author Masonluo
 * @date 2020-09-05 10:49
 */
public class _416_分割等和子集 {
    public static boolean canPartition(int[] nums) {
        if (nums.length < 2) {
            return false;
        }
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        if (sum % 2 != 0) {
            return false;
        }
        int cap = sum / 2;
        return canPartition(cap, nums);
    }

    private static boolean canPartition(int cap, int[] nums) {

        boolean[][] dp = new boolean[nums.length + 1][cap + 1];
        for (int i = 0; i < nums.length; i++) {
            dp[i][0] = true;
        }
        for (int i = 0; i < cap; i++) {
            dp[0][i] = false;
        }

        for (int i = 1; i <= nums.length; i++) {
            for (int j = 1; j <= cap; j++) {
                if (nums[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = (dp[i - 1][j] || dp[i - 1][j - nums[i - 1]]);
                }
            }
        }
        return dp[nums.length][cap];
    }

    public static void main(String[] args) {
        System.out.println(canPartition(new int[]{1, 2, 5, 8}));
    }
}
