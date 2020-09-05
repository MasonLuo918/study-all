package com.masonluo.leetcode._每日一题;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Masonluo
 * @date 2020-09-05 08:48
 */
public class _60_第k个排列 {

    public static String getPermutation(int n, int k) {
        k--;
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = i * dp[i - 1];
        }
        List<Integer> nums = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            nums.add(i);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = n - 1; i >= 0; i--) {
            int index = k / dp[i];
            sb.append(nums.remove(index));
            k %= dp[i];
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(getPermutation(9, 20));
    }
}
