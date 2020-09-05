package com.masonluo.leetcode._动态规划;

/**
 * @author Masonluo
 * @date 2020-09-04 17:52
 */
public class _887_鸡蛋掉落 {
    public static int superEggDrop(int K, int N) {
        Integer[][] memo = new Integer[K + 1][N + 1];
        return dp(K, N, memo);
    }

    public static int dp(int K, int N, Integer[][] memory) {
        if (N == 0) return 0;
        if (K == 1) return N;
        if (memory[K][N] != null) {
            return memory[K][N];
        }
        int res = Integer.MAX_VALUE;
        for (int i = 1; i <= N; i++) {
            res = Math.min(res, Math.max(dp(K, N - i, memory), dp(K - 1, i - 1, memory)) + 1);
        }
        memory[K][N] = res;
        return res;
    }

    public static void main(String[] args) {
        System.out.println(superEggDrop(3, 14));
    }
}
