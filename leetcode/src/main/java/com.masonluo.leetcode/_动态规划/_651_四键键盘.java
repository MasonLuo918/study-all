package com.masonluo.leetcode._动态规划;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Masonluo
 * @date 2020-09-24 19:56
 */
public class _651_四键键盘 {
    public static int maxA_v1(int n) {
        return dp_v1(n, 0, 0);
    }

    private static Map<String, Integer> map = new HashMap<>();

    private static int dp_v1(int n, int aNum, int copy) {
        if (n <= 0) return aNum;
        String key = "" + n + "-" + aNum + "-" + copy;
        if (map.containsKey(key)) {
            return map.get(key);
        }
        int res = max(
                dp_v1(n - 1, aNum + 1, copy),
                dp_v1(n - 1, aNum + copy, copy),
                dp_v1(n - 2, aNum, aNum)
        );
        map.put(key, res);
        return res;
    }

    public static int max(int... max) {
        if (max.length == 0) {
            return 0;
        }
        int m = max[0];
        for (int i = 0; i < max.length; i++) {
            if (m < max[i]) {
                m = max[i];
            }
        }
        return m;
    }

    public static int maxA_v2(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i - 1] + 1;
            for (int j = 2; j < i; j++) {
                dp[i] = max(dp[i], dp[j - 2] * (i - j + 1));
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(maxA_v2(3));
        System.out.println(maxA_v2(7));
    }
}
