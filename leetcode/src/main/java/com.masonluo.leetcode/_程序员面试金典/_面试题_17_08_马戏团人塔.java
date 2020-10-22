package com.masonluo.leetcode._程序员面试金典;

import java.util.Arrays;

/**
 * @author Masonluo
 * @date 2020-10-15 16:38
 */
public class _面试题_17_08_马戏团人塔 {
    public static int bestSeqAtIndex(int[] height, int[] weight) {
        int len = height.length;
        Person[] person = new Person[len];
        for (int i = 0; i < len; i++) {
            person[i] = new Person(height[i], weight[i]);
        }
        Arrays.sort(person, (o1, o2) -> Integer.compare(o2.height, o1.height));
        int[] dp = new int[len];
        Arrays.fill(dp, 1);
        int maxLen = 1;
        for (int i = 1; i < len; i++) {
            for (int j = 0; j < i; j++) {
                if (person[i].height < person[j].height && person[i].weight < person[j].weight) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            if (maxLen < dp[i]) {
                maxLen = dp[i];
            }
        }
        return maxLen;
    }

    static class Person {
        int height, weight;

        public Person() {
        }

        public Person(int height, int weight) {
            this.height = height;
            this.weight = weight;
        }
    }

    public static void main(String[] args) {
        bestSeqAtIndex(new int[]{65,70,56,75,60,68}, new int[]{100,150,90,190,95,110});
    }
}
