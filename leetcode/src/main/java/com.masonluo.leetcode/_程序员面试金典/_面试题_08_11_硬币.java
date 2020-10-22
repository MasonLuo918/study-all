package com.masonluo.leetcode._程序员面试金典;

/**
 * @author Masonluo
 * @date 2020-10-09 09:05
 */
public class _面试题_08_11_硬币 {

    static int mod = 1000000007;

    public static int waysToChange(int n) {
        int[] coins = {1, 5, 10, 25};
        int len1 = coins.length, len2 = n;
        int[][] dp = new int[len1 + 1][len2 + 1];
        for (int i = 1; i <= len1; i++){
            dp[i][0] = 1;
        }
        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                if (coins[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = (dp[i - 1][j] + dp[i][j - coins[i - 1]]) % mod;
                }
            }
        }
        return dp[len1][len2];
    }

    public static void main(String[] args) {
        System.out.println(waysToChange(10));
    }
}
