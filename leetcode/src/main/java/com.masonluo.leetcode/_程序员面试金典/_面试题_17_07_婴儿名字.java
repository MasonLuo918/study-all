package com.masonluo.leetcode._程序员面试金典;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Masonluo
 * @date 2020-10-16 10:01
 */
public class _面试题_17_07_婴儿名字 {

    static class UF {
        Map<String, String> parent = new HashMap<>();

        Map<String, Integer> size = new HashMap<>();

        UF(String[] init) {
            for (String s : init) {
                parent.put(s, s);
                size.put(s, 1);
            }
        }

        void union(String s1, String s2) {
            String p1 = findRoot(s1);
            String p2 = findRoot(s2);
            if (p1.equals(p2)) {
                return;
            }
            int size1 = size.get(p1);
            int size2 = size.get(p2);
            if (size1 > size2) {
                parent.put(p2, p1);
                size.put(p1, size1 + size2);
            } else {
                parent.put(p1, p2);
                size.put(p2, size1 + size2);
            }
        }

        boolean connected(String s1, String s2) {
            String p1 = parent.get(s1);
            String p2 = parent.get(s2);
            return p1.equals(p2);
        }

        String findRoot(String s) {
            while (!(parent.get(s).equals(s))) {
                parent.put(s, parent.get(parent.get(s)));
                s = parent.get(s);
            }
            return s;
        }
    }

}
