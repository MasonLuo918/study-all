package com.masonluo.leetcode._程序员面试金典;

import java.util.*;

/**
 * @author Masonluo
 * @date 2020-10-15 17:08
 */
public class _面试题_10_02_变位词组 {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) {
            return Collections.emptyList();
        }
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            int[] count = new int[26];
            for (char c : str.toCharArray()) {
                count[c - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                for (int j = 0; j < count[i]; j++) {
                    sb.append((char) (i + 'a'));
                }
            }
            String key = sb.toString();
            if (map.containsKey(key)) {
                map.get(key).add(str);
            } else {
                map.put(key, new ArrayList<String>() {{
                    add(str);
                }});
            }
        }
        return new ArrayList<List<String>>(map.values());
    }
}
