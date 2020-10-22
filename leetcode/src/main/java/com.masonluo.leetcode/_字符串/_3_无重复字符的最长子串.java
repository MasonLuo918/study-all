package com.masonluo.leetcode._字符串;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Masonluo
 * @date 2020-10-22 10:13
 */
public class _3_无重复字符的最长子串 {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        Map<Character, Integer> windows = new HashMap<>();
        int left = 0, res = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (windows.containsKey(c)) {
                windows.put(c, windows.get(c) + 1);
            } else {
                windows.put(c, 1);
            }
            while (windows.get(c) > 1) {
                char d = s.charAt(left);
                windows.put(d, windows.get(d) - 1);
                left++;
            }
            res = Math.max(res, i - left + 1);
        }
        return res;
    }
}
