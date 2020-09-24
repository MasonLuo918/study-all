package com.masonluo.leetcode._动态规划;

/**
 * https://leetcode-cn.com/problems/target-sum/
 *
 * @author Masonluo
 * @date 2020-09-24 12:24
 */
public class _494_目标和 {
    public static int findTargetSumWays(int[] nums, int S) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if (sum < S || (sum + S) % 2 == 1) {
            return 0;
        }
        return subset(nums, (sum + S) / 2);
    }

    private static int subset(int[] nums, int target) {
        int len = nums.length;
        int[][] dp = new int[len + 1][target + 1];
        for (int i = 0; i <= len; i++){
            dp[i][0] = 1;
        }
        for (int i = 1; i <= len; i++) {
            for (int j = 0; j <= target; j++) {
                if (j >= nums[i - 1]) {
                    dp[i][j] = dp[i - 1][j - nums[i - 1]] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[len][target];
    }

    public static void main(String[] args) {
        System.out.println(findTargetSumWays(new int[]{1000}, 1000));
    }
}
