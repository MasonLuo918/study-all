package com.masonluo.written_examination._58;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Masonluo
 * @date 2020-09-21 20:13
 */
public class Ex_3 {
    /**
     * 合并数组
     *
     * @param arrayA int整型ArrayList 数组A
     * @param arrayB int整型ArrayList 数组B
     * @return int整型ArrayList
     */
    public ArrayList<Integer> mergerArrays(ArrayList<Integer> arrayA, ArrayList<Integer> arrayB) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int point1 = 0, point2 = 0;
        while (point1 < arrayA.size() && point2 < arrayB.size()) {
            if (arrayA.get(point1).equals(arrayB.get(point2))) {
                result.add(arrayA.get(point1));
                point1++;
                point2++;
            } else if (arrayA.get(point1) < arrayB.get(point2)) {
                point1++;
            } else {
                point2++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Ex_3 ex_3 = new Ex_3();
        ArrayList<Integer> arrayA = new ArrayList<Integer>(Arrays.asList(-5, 0, 6, 8, 9, 10));
        ArrayList<Integer> arrayB = new ArrayList<Integer>(Arrays.asList(0, 8, 9, 11, 15));
        System.out.println(ex_3.mergerArrays(arrayA, arrayB));
    }
}
