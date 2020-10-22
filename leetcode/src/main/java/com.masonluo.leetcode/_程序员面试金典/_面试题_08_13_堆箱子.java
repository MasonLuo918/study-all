package com.masonluo.leetcode._程序员面试金典;

import java.util.Arrays;

/**
 * @author Masonluo
 * @date 2020-10-09 17:33
 */
public class _面试题_08_13_堆箱子 {
    public static int pileBox(int[][] box) {
        Arrays.sort(box, (o1, o2) -> Integer.compare(o2[0], o1[0]));
        int len = box.length;
        int[] dp = new int[len + 1];
        for (int i = 1; i < dp.length; i++) {
            dp[i] = box[i - 1][2];
        }
        int max = Integer.MIN_VALUE;
        for (int i = 2; i <= len; i++) {
            for (int j = 1; j < i; j++) {
                if (box[j - 1][0] > box[i - 1][0] && box[j - 1][1] > box[i - 1][1] && box[j - 1][2] > box[i - 1][2]) {
                    dp[i] = Math.max(dp[j] + box[i - 1][2], dp[i]);
                }
            }
            if (max < dp[i]) {
                max = dp[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] box = {
                {1, 2, 3}
        };
        System.out.println(pileBox(box));
    }
}
