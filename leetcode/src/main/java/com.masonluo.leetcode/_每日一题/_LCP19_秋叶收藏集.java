package com.masonluo.leetcode._每日一题;

/**
 * @author Masonluo
 * @date 2020-10-02 14:49
 */
public class _LCP19_秋叶收藏集 {
    public static int minimumOperations(String leaves) {
        int n = leaves.length();
        int[][] f = new int[n][3];
        f[0][0] = leaves.charAt(0) == 'y' ? 1 : 0;
        f[0][1] = f[0][2] = f[1][2] = Integer.MAX_VALUE;
        for (int i = 1; i < n; ++i) {
            int isRed = leaves.charAt(i) == 'r' ? 1 : 0;
            int isYellow = leaves.charAt(i) == 'y' ? 1 : 0;
            f[i][0] = f[i - 1][0] + isYellow;
            f[i][1] = Math.min(f[i - 1][0], f[i - 1][1]) + isRed;
            if (i >= 2) {
                f[i][2] = Math.min(f[i - 1][1], f[i - 1][2]) + isYellow;
            }
        }
        return f[n - 1][2];
    }

    public static void main(String[] args) {
        System.out.println(minimumOperations("rrryyyrryyyrr"));
    }

}
