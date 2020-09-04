package com.masonluo.leetcode._剑指offer;

/**
 * @author Masonluo
 * @date 2020-09-04 09:45
 */
public class _剑指Offer33_二叉搜索树的后序遍历序列 {
    public static boolean verifyPostorder(int[] postorder) {
        return verifyPostorder(postorder, 0, postorder.length - 1);
    }

    public static boolean verifyPostorder(int[] postOrder, int start, int end) {
        if (start >= end) {
            return true;
        }
        int root = postOrder[end];
        int rightStart = start;
        for (; rightStart < end; rightStart++) {
            if (postOrder[rightStart] > root) {
                break;
            }
        }
        for (int i = rightStart; i < end; i++) {
            if (postOrder[i] <= root) {
                return false;
            }
        }
        return verifyPostorder(postOrder, start, rightStart - 1) && verifyPostorder(postOrder, rightStart, end - 1);
    }

    public static void main(String[] args) {
        System.out.println(verifyPostorder(new int[]{5, 4, 3, 2, 1}));
    }
}
