package com.masonluo.leetcode._剑指offer;

import com.masonluo.leetcode.Base.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Masonluo
 * @date 2020-09-04 15:24
 */
public class _剑指Offer34_二叉树中和为某一值的路径 {
    public static List<List<Integer>> pathSum(TreeNode root, int sum) {
        if (root == null){
            return Collections.emptyList();
        }
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> base = new ArrayList<>();
        pathSum(root, sum, result, base);
        return result;
    }

    private static void pathSum(TreeNode root, int sum, List<List<Integer>> result, List<Integer> base) {
        if (sum - root.val == 0 && root.left == null && root.right == null) {
            base.add(root.val);
            result.add(new ArrayList<>(base));
            base.remove(base.size() - 1);
        } else {
            if (root.left == null && root.right == null) {
                return;
            }
            base.add(root.val);
            if (root.left != null) {
                pathSum(root.left, sum - root.val, result, base);
            }
            if (root.right != null) {
                pathSum(root.right, sum - root.val, result, base);
            }
            base.remove(base.size() - 1);
        }
    }

    public static void main(String[] args) {
//        TreeNode treeNode = new TreeNode(5);
//        treeNode.left = new TreeNode(4);
//        treeNode.right = new TreeNode(8);
//        treeNode.left.left = new TreeNode(11);
//        treeNode.right.left = new TreeNode(13);
//        treeNode.right.right = new TreeNode(4);
//        treeNode.left.left.left = new TreeNode(7);
//        treeNode.left.left.right = new TreeNode(2);
//        treeNode.right.right.left = new TreeNode(5);
//        treeNode.right.right.right = new TreeNode(1);
        TreeNode treeNode = new TreeNode(-2);
        treeNode.right = new TreeNode(-3);
        List<List<Integer>> result = pathSum(treeNode, -5);
        System.out.println(result);
    }
}
