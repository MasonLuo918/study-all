package com.masonluo.leetcode._动态规划;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Masonluo
 * @date 2020-09-24 19:06
 */
public class _887_鸡蛋掉落_进阶 {
    public static int superEggDrop(int K, int N) {
        return dp(K, N);
    }


    private static Map<String, Integer> memo = new HashMap<>();

    private static int dp(int k, int n) {
        if (k == 1) {
            return n;
        }
        if (n == 0) {
            return 0;
        }
        String key = "" + k + "-" + n;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        int result = Integer.MAX_VALUE;
        int low = 1, high = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int broken = dp(k - 1, mid - 1);
            int unBroker = dp(k, n - mid);
            if (broken > unBroker) {
                high = mid - 1;
                result = Math.min(result, broken + 1);
            } else {
                low = mid + 1;
                result = Math.min(result, unBroker + 1);
            }
        }
        memo.put(key, result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(superEggDrop(3, 14));
    }

}
