package com.masonluo.leetcode._动态规划;

import java.util.Arrays;

/**
 * @author Masonluo
 * @date 2020-09-19 17:29
 */
public class _354_俄罗斯套娃信封问题 {
    public static int maxEnvelopes(int[][] envelopes) {
        if (envelopes.length == 0) {
            return 0;
        }
        Arrays.sort(envelopes, (o1, o2) -> o1[0] != o2[0] ? Integer.compare(o1[0], o2[0]) : Integer.compare(o1[1], o2[1]));
        int max = 1;
        int[] dp = new int[envelopes.length + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = 1;
        }
        for (int i = 1; i < envelopes.length; i++) {
            for (int j = 0; j < i; j++) {
                if (envelopes[i][0] <= envelopes[j][0]) {
                    break;
                }
                if (envelopes[i][1] <= envelopes[j][1]) {
                    continue;
                }
                dp[i] = Math.max(dp[i], dp[j] + 1);
            }
            if (dp[i] > max) {
                max = dp[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxEnvelopes(new int[][]{
                {5, 4},
        }));
    }
}
