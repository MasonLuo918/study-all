package com.masonluo.leetcode.二叉树;

import com.masonluo.leetcode.Base.TreeNode;

/**
 * @author Masonluo
 * @date 2020-09-30 08:54
 */
public class _701_二叉搜索树中的插入操作 {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (val < root.val) {
            root.left = insertIntoBST(root.left, val);
        } else {
            root.right = insertIntoBST(root.right, val);
        }
        return root;
    }
}
