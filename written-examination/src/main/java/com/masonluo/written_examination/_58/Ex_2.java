package com.masonluo.written_examination._58;

import java.util.Arrays;

/**
 * @author Masonluo
 * @date 2020-09-21 20:09
 */
public class Ex_2 {
    public int[] countBits(int num) {
        int[] array = new int[num + 1];
        for (int i = 0; i <= num; i++) {
            array[i] = getBitOne(i);
        }
        return array;
    }

    public int getBitOne(int num) {
        int count = 0;
        while (num != 0) {
            num = num & (num - 1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Ex_2 ex_2 = new Ex_2();
        System.out.println(Arrays.toString(ex_2.countBits(5)));
    }
}
