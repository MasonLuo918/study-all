package com.masonluo.leetcode._每日一题;

import java.util.*;

/**
 * @author Masonluo
 * @date 2020-09-07 08:46
 */
public class _347_前K个高频元素 {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(k, Comparator.comparingInt(map::get));
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            if (priorityQueue.size() < k) {
                priorityQueue.add(key);
            } else if (map.get(key) > map.get(priorityQueue.peek())){
                priorityQueue.remove();
                priorityQueue.add(key);
            }
        }
        int[] res = new int[k];
        for (int i = 0; i < res.length; i++){
            res[i] = priorityQueue.remove();
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(topKFrequent(new int[]{1}, 1)));
    }
}
