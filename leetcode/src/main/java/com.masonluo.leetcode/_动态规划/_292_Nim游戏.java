package com.masonluo.leetcode._动态规划;

/**
 * @author Masonluo
 * @date 2020-09-01 17:44
 */
public class _292_Nim游戏 {
    public boolean canWinNim(int n) {
        return dp(n);
    }

    public boolean dp(int n) {
        if (n <= 3) {
            return true;
        }
        boolean[] dp = new boolean[n + 1];
        dp[1] = true;
        dp[2] = true;
        dp[3] = true;
        for (int i = 4; i <= n; i++) {
            dp[i] = (!dp[i - 1] || !dp[i - 2] || !dp[i - 3]);
        }
        return dp[n];
    }
}
