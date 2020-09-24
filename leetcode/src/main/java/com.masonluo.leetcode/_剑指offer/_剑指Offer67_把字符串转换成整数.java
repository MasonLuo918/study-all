package com.masonluo.leetcode._剑指offer;

/**
 * @author Masonluo
 * @date 2020-09-24 10:19
 */
public class _剑指Offer67_把字符串转换成整数 {
    public static int strToInt(String str) {
        String s = str.trim();
        if (s.length() == 0){
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            sb.append(s.charAt(i));
            i++;
        }
        while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            sb.append(s.charAt(i++));
        }
        return convertToInt(sb.toString());
    }

    private static int convertToInt(String str) {
        int i = 0, len = str.length();
        int limit = -Integer.MAX_VALUE;
        int mulLimit, radix = 10;
        int result = 0;
        boolean negative = false;
        if (len > 0) {
            char firstChar = str.charAt(0);
            if (firstChar < '0') {
                if (firstChar == '-') {
                    negative = true;
                    limit = Integer.MIN_VALUE;
                } else if (firstChar != '+') {
                    throw new IllegalArgumentException();
                }
                if (len == 1) {
                    return 0;
                }
                i++;
            }
            mulLimit = limit / radix;
            while (i < len) {
                int digit = str.charAt(i++) - '0';
                if (result < mulLimit) {
                    return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
                result *= radix;
                if (limit + digit > result) {
                    return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
                result -= digit;
            }
        }
        return negative ? result : -result;
    }

    public static void main(String[] args) {
        System.out.println(strToInt("+"));
    }
}
