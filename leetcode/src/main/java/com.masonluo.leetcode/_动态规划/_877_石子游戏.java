package com.masonluo.leetcode._动态规划;

/**
 * @author Masonluo
 * @date 2020-09-25 10:11
 */
public class _877_石子游戏 {
    public boolean stoneGame(int[] piles) {
        int len = piles.length;
        if (len == 0) {
            return true;
        }
        int[][] dp = new int[len][len];
        for (int i = 0; i < len; i++) {
            dp[i][i] = piles[i];
        }
        for (int i = len - 2; i >= 0; i--) {
            for (int j = i + 1; j < len; j++) {
                dp[i][j] = Math.max(piles[i] - dp[i + 1][j], piles[j] - dp[i][j - 1]);
            }
        }
        return dp[0][len - 1] > 0;
    }

    static class Pair {
        int fir, sec;

        Pair(int fir, int sec) {
            this.fir = fir;
            this.sec = sec;
        }
    }

    public boolean stoneGame2(int[] pipes) {
        int n = pipes.length;
        Pair[][] dp = new Pair[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                dp[i][j] = new Pair(0, 0);
            }
        }

        for (int i = 0; i < n; i++) {
            dp[i][i] = new Pair(pipes[i], 0);
        }

        for (int i = n - 2; i >= 0; i--) {
            for (int j = i + 1; j < n; j++) {
                int left = pipes[i] + dp[i + 1][j].sec;
                int right = pipes[j] + dp[i][j - 1].sec;
                if (left > right) {
                    dp[i][j].fir = left;
                    dp[i][j].sec = dp[i + 1][j].fir;
                } else {
                    dp[i][j].fir = right;
                    dp[i][j].sec = dp[i][j - 1].fir;
                }
            }
        }
        return dp[0][n - 1].fir > dp[0][n - 1].sec;
    }
}
