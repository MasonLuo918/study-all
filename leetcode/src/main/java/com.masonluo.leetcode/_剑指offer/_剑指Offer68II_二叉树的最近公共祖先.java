package com.masonluo.leetcode._剑指offer;

import com.masonluo.leetcode.Base.TreeNode;

/**
 * @author Masonluo
 * @date 2020-09-23 11:09
 */
public class _剑指Offer68II_二叉树的最近公共祖先 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        if (root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left != null && right != null) {
            return root;
        }
        if (left == null && right == null) {
            return null;
        }
        return left == null ? right : left;
    }
}
