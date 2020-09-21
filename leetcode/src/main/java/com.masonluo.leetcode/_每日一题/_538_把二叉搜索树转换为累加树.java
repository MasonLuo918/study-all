package com.masonluo.leetcode._每日一题;

import com.masonluo.leetcode.Base.TreeNode;

/**
 * @author Masonluo
 * @date 2020-09-21 09:28
 */
public class _538_把二叉搜索树转换为累加树 {

    int sum = 0;

    public TreeNode convertBST(TreeNode root) {
        if (root != null) {
            convertBST(root.right);
            sum += root.val;
            root.val = sum;
            convertBST(root.left);
        }
        return root;
    }
}
