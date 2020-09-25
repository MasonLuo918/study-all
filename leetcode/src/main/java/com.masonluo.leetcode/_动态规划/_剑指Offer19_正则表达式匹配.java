package com.masonluo.leetcode._动态规划;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Masonluo
 * @date 2020-09-25 11:14
 */
public class _剑指Offer19_正则表达式匹配 {
    private String s;

    private String p;

    private Map<String, Boolean> memo = new HashMap<>();

    public boolean isMatch(String s, String p) {
        this.s = s;
        this.p = p;
        memo.clear();
        return dp(0, 0);
    }

    private boolean dp(int sIdx, int pIdx) {
        String key = "" + sIdx + "-" + pIdx;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        // 如果匹配串匹配完毕，那么原串也需要匹配完毕
        if (pIdx == p.length()) {
            memo.put(key, sIdx == s.length());
            return sIdx == s.length();
        }
        boolean res;
        boolean firstMatch = sIdx < s.length() && (p.charAt(pIdx) == '.' || p.charAt(pIdx) == s.charAt(sIdx));
        if (pIdx < p.length() - 1 && p.charAt(pIdx + 1) == '*') {
            res = dp(sIdx, pIdx + 2) || (firstMatch && dp(sIdx + 1, pIdx));
        } else {
            res = firstMatch && dp(sIdx + 1, pIdx + 1);
        }
        memo.put(key, res);
        return res;
    }

    public static void main(String[] args) {
        _剑指Offer19_正则表达式匹配 res = new _剑指Offer19_正则表达式匹配();
        System.out.println(res.isMatch("ab", ".*c"));
//        System.out.println(res.isMatch("aa", "a"));
//        System.out.println(res.isMatch("aa", "a*"));
//        System.out.println(res.isMatch("ab", ".*"));
//        System.out.println(res.isMatch("aab", "c*a*b"));
//        System.out.println(res.isMatch("mississippi", "mis*is*p*."));
    }
}
