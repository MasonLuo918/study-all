package com.masonluo.leetcode._字符串匹配算法;

import checkers.units.quals.K;

/**
 * @author Masonluo
 * @date 2020-09-21 01:06
 */
public class KMP {
    private String pattern;

    private int[][] dp;

    private final static int ASCII_NUM = 256;

    public KMP(String pattern) {
        this.pattern = pattern;
        int len = pattern.length();
        dp = new int[len][ASCII_NUM];
        initNextArray();
    }

    private void initNextArray() {
        // base status
        dp[0][pattern.charAt(0)] = 1;
        int X = 0;
        for (int j = 1; j < pattern.length(); j++) {
            for (int i = 0; i < ASCII_NUM; i++) {
                if (pattern.charAt(j) == i) {
                    dp[j][i] = j + 1;
                } else {
                    dp[j][i] = dp[X][i];
                }
            }
            // 影子，与当前字符串有相同的前缀(后缀)
            X = dp[X][pattern.charAt(j)];
        }
    }

    public int search(String txt) {
        int j = 0;
        for (int i = 0; i < txt.length(); i++) {
            j = dp[j][txt.charAt(i)];
            if (j == dp.length) return i - pattern.length() + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "ababab";
        String newS = (s + s).substring(1, 2 * s.length() - 1);
        KMP kmp = new KMP(s);
        System.out.println(kmp.search(newS));
    }
}
