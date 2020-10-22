package com.masonluo.leetcode._每日一题;

/**
 * @author Masonluo
 * @date 2020-10-21 08:15
 */
public class _925_长按键入 {
    public static boolean isLongPressedName(String name, String typed) {
        int i = 0, j = 0;
        while (j < typed.length()) {
            if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            } else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {
                j++;
            } else {
                return false;
            }
        }
        return i == name.length();
    }

    public static void main(String[] args) {
        System.out.println(isLongPressedName("vtkgn", "vttkgnn"));
    }

}
