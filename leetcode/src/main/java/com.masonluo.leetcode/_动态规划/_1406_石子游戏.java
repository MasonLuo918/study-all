package com.masonluo.leetcode._动态规划;

/**
 * @author Masonluo
 * @date 2020-09-01 18:55
 */
public class _1406_石子游戏 {
    public static String stoneGameIII(int[] stoneValue) {
        int len = stoneValue.length;
        int[] dp = new int[len + 1];
        dp[len] = 0;
        int sum = 0;
        for (int i = len - 1; i >= 0; i--) {
            sum += stoneValue[i];
            dp[i] = Integer.MIN_VALUE;
            for (int j = i; j < i + 3 && j < len; j++) {
                dp[i] = Math.max(dp[i], sum - dp[j + 1]);
            }
        }
        int alice = dp[0];
        int bob = sum - dp[0];
        if (alice == bob) {
            return "Tie";
        } else if (alice > bob) {
            return "Alice";
        } else {
            return "Bob";
        }
    }

    public static void main(String[] args) {
        System.out.println(stoneGameIII(new int[]{-1, -2, -3}));
    }
}
