package com.masonluo.leetcode._摩尔投票法;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Masonluo
 * @date 2020-09-19 23:14
 */
public class _229_求众数_II {
    public List<Integer> majorityElement(int[] nums) {
        if (nums.length == 0){
            return Collections.emptyList();
        }
        int major1 = nums[0], count1 = 0;
        int major2 = nums[0], count2 = 0;
        for (int num : nums) {
            if (num == major1) {
                count1++;
                continue;
            }
            if (num == major2) {
                count2++;
                continue;
            }
            if (count1 == 0) {
                major1 = num;
                count1 = 1;
                continue;
            }
            if (count2 == 0) {
                major2 = num;
                count2 = 1;
                continue;
            }
            count1--;
            count2--;
        }
        count1 = count2 = 0;
        List<Integer> res = new ArrayList<>();
        for (int num : nums) {
            if (num == major1) {
                count1++;
                continue;
            }
            if (num == major2) {
                count2++;
            }
        }
        if (count1 > nums.length / 3) res.add(major1);
        if (count2 > nums.length / 3) res.add(major2);
        return res;
    }
}
