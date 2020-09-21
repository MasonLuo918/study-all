package com.masonluo.leetcode._剑指offer;

/**
 * @author Masonluo
 * @date 2020-09-21 09:40
 */
public class _剑指Offer48_最长不含重复字符的子字符串 {
    public static int lengthOfLongestSubstring(String s) {
        int[] hash = new int[256];
        for (int i = 0; i < hash.length; i++) {
            hash[i] = -1;
        }
        int left = 0, right = 0;
        int len = 0;
        while (right < s.length()) {
            char c = s.charAt(right);
            right++;
            while (hash[c] != -1) {
                char t = s.charAt(left);
                left++;
                hash[t] = -1;
            }
            hash[c] = right;
            if (len < (right - left)) {
                len = right - left;
            }
        }
        return len;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
}
