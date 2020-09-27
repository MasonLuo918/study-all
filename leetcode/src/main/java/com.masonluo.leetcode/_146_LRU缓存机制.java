package com.masonluo.leetcode;

import java.util.LinkedHashMap;

/**
 * @author Masonluo
 * @date 2020-09-26 11:19
 */
public class _146_LRU缓存机制 {
    class LRUCache {

        private LinkedHashMap<Integer, Integer> hashMap;

        private int cap;

        public LRUCache(int capacity) {
            this.cap = capacity;
            hashMap = new LinkedHashMap<>(capacity);
        }

        public int get(int key) {
            if (!hashMap.containsKey(key)) {
                return -1;
            }
            makeRecently(key);
            return hashMap.get(key);
        }

        public void put(int key, int value) {
            if (hashMap.containsKey(key)) {
                hashMap.put(key, value);
                makeRecently(key);
                return;
            }

            if (hashMap.size() >= cap) {
                int oldKey = hashMap.keySet().iterator().next();
                hashMap.remove(oldKey);
            }
            hashMap.put(key, value);
        }

        public void makeRecently(int key) {
            int val = hashMap.get(key);
            hashMap.remove(key);
            hashMap.put(key, val);
        }
    }
}
