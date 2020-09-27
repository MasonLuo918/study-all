package com.masonluo.leetcode._每日一题;

import com.masonluo.leetcode.Base.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Masonluo
 * @date 2020-09-26 08:04
 */
public class _113_路径总和_II {

    public static List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        LinkedList<Integer> tmp = new LinkedList<>();
        dfs(root, sum, res, tmp);
        return res;
    }

    private static void dfs(TreeNode root, int sum, List<List<Integer>> res, LinkedList<Integer> tmp) {
        if (root == null) {
            return;
        }
        if (root.val == sum && root.left == null && root.right == null) {
            tmp.add(root.val);
            res.add(new ArrayList<>(tmp));
            tmp.removeLast();
            return;
        }
        sum -= root.val;
        tmp.add(root.val);
        dfs(root.left, sum, res, tmp);
        dfs(root.right, sum, res, tmp);
        tmp.removeLast();
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(-2);
        treeNode.right = new TreeNode(-3);
        System.out.println(pathSum(treeNode, -5));
    }
}
