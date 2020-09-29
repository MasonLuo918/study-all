package com.masonluo.leetcode._递归;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Masonluo
 * @date 2020-09-28 11:47
 */
public class _969_煎饼排序 {
    public static List<Integer> pancakeSort(int[] arr) {
        if (arr == null) {
            return Collections.emptyList();
        }
        LinkedList<Integer> linkedList = new LinkedList<>();
        sort(arr, arr.length, linkedList);
        return linkedList;
    }

    public static void sort(int[] arr, int n, LinkedList<Integer> list) {
        if (n == 1) return;
        int index = getMaxIndex(arr, 0, n);
        reverse(arr, 0, index);
        list.add(index + 1);
        reverse(arr, 0, n - 1);
        list.add(n);
        sort(arr, n - 1, list);
    }

    public static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static int getMaxIndex(int[] array, int i, int j) {
        int max = i;
        for (int k = i; k < j; k++) {
            max = array[max] < array[k] ? k : max;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(pancakeSort(new int[]{3, 2, 4, 1}));
    }
}
