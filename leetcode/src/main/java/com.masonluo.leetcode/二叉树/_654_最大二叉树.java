package com.masonluo.leetcode.二叉树;

import com.masonluo.leetcode.Base.TreeNode;

/**
 * @author Masonluo
 * @date 2020-09-23 11:32
 */
public class _654_最大二叉树 {
    public static TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructMaximumBinaryTree(nums, 0, nums.length - 1);
    }

    private static TreeNode constructMaximumBinaryTree(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        int idx = findMaxIndex(nums, start, end);
        TreeNode root = new TreeNode(nums[idx]);
        root.left = constructMaximumBinaryTree(nums, start, idx - 1);
        root.right = constructMaximumBinaryTree(nums, idx + 1, end);
        return root;
    }

    private static int findMaxIndex(int[] nums, int startIndex, int endIndex) {
        int max = startIndex;
        for (int i = startIndex; i <= endIndex; i++) {
            if (nums[max] < nums[i]) {
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        TreeNode node = constructMaximumBinaryTree(new int[]{3, 2, 1, 6, 0, 5});
        System.out.println(node);
    }
}
