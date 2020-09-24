package com.masonluo.leetcode._动态规划;

/**
 * leetcode : https://leetcode-cn.com/problems/edit-distance/
 * labuladong : https://labuladong.gitbook.io/algo/dong-tai-gui-hua-xi-lie/bian-ji-ju-li
 *
 * @author Masonluo
 * @date 2020-09-24 17:02
 */
public class _72_编辑距离 {
    public static int minDistance(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        int[][] dp = new int[len1 + 1][len2 + 1];
        // 初始化base case
        for (int j = 0; j <= len2; j++) {
            dp[0][j] = j;
        }
        for (int i = 0; i <= len1; i++) {
            dp[i][0] = i;
        }
        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j - 1], dp[i - 1][j]), dp[i][j - 1]) + 1;
                }
            }
        }
        return dp[len1][len2];
    }

    public static void main(String[] args) {
        System.out.println(minDistance("rad", "apple"));
    }
}
