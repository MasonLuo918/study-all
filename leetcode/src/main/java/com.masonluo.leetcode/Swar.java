package com.masonluo.leetcode;

/**
 * @author Masonluo
 * @date 2020-09-23 14:53
 */
public class Swar {
    static int swar(int i) {
        i = (i & 0x55555555) + ((i >> 1) & 0x55555555);
        i = (i & 0x33333333) + ((i >> 2) & 0x33333333);
        i = (i & 0x0F0F0F0F) + ((i >> 4) & 0x0F0F0F0F);
        i = (i * (0x01010101) >> 24);
        return i;
    }

    static void printBinaryNum(int i) {
        String s = Integer.toBinaryString(i);
        for (int j = 0; j < 32 - s.length(); j++){
            System.out.print('0');
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        swar(2801380);
    }
}
