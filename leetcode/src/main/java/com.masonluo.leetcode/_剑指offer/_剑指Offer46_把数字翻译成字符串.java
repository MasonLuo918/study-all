package com.masonluo.leetcode._剑指offer;

/**
 * @author Masonluo
 * @date 2020-09-20 10:38
 */
public class _剑指Offer46_把数字翻译成字符串 {
    public static int translateNum(int num) {
        String str = String.valueOf(num);
        int i_2 = 1, i_1 = 1, r = 1;
        for (int i = 1; i < str.length(); i++) {
            r = 0;
            r += i_1;
            String sub = str.substring(i - 1, i + 1);
            if (sub.compareTo("25") <= 0 && sub.compareTo("10") >= 0) {
                r += i_2;
            }
            i_2 = i_1;
            i_1 = r;
        }
        return r;
    }

    public static void main(String[] args) {
        System.out.println(translateNum(1213210391));
    }
}
