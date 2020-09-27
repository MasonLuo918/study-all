package com.masonluo.leetcode.二叉树;

import com.masonluo.leetcode.Base.TreeNode;

import java.util.Stack;

/**
 * @author Masonluo
 * @date 2020-09-27 08:37
 */
public class _222_完全二叉树的节点个数 {
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        TreeNode l = root.left, r = root.right;
        int lc = 0, rc = 0;
        while (l != null) {
            lc++;
            l = l.left;
        }
        int[] arra;
        while (r != null) {
            rc++;
            r = r.right;
        }
        if (lc == rc) {
            return (int) Math.pow(2, lc) - 1;
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}
