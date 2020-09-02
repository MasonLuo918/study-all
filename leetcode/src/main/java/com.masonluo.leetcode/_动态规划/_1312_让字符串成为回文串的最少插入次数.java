package com.masonluo.leetcode._动态规划;

/**
 * @author Masonluo
 * @date 2020-09-02 12:11
 */
public class _1312_让字符串成为回文串的最少插入次数 {
    public int minInsertions(String s) {
        if (s == null || s.length() <= 1) {
            return 0;
        }
        int len = s.length();
        int[][] dp = new int[len][len];
        for (int i = 0; i < len; i++) {
            dp[i][i] = 0;
        }
        for (int i = len - 2; i >= 0; i--) {
            for (int j = i + 1; j < len; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1];
                } else {
                    dp[i][j] = Math.min(dp[i + 1][j], dp[i][j - 1]) + 1;
                }
            }
        }
        return dp[0][len - 1];
    }
}
