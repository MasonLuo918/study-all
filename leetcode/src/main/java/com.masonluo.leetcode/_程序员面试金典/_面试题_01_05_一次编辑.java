package com.masonluo.leetcode._程序员面试金典;

/**
 * @author Masonluo
 * @date 2020-10-03 09:01
 */
public class _面试题_01_05_一次编辑 {
    public static boolean oneEditAway(String first, String second) {
        int len1 = first.length();
        int len2 = second.length();
        int[][] dp = new int[len1 + 1][len2 + 1];
        for (int i = 1; i <= len1; i++) {
            dp[i][0] = i;
        }
        for (int j = 1; j <= len2; j++) {
            dp[0][j] = j;
        }
        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                if (first.charAt(i - 1) == second.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i][j - 1], dp[i - 1][j])) + 1;
                }
            }
        }
        return dp[len1][len2] <= 1;
    }

    public static void main(String[] args) {
        System.out.println(oneEditAway("pales", "pal"));
    }
}
