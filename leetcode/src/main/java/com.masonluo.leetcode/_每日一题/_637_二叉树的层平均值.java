package com.masonluo.leetcode._每日一题;

import com.masonluo.leetcode.Base.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Masonluo
 * @date 2020-09-12 09:34
 */
public class _637_二叉树的层平均值 {
    public List<Double> averageOfLevels(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        List<Double> result = new ArrayList<>();
        LinkedList<TreeNode> linkedList = new LinkedList<>();
        linkedList.add(root);
        while (!linkedList.isEmpty()) {
            int len = linkedList.size();
            double sum = 0;
            for (int i = 0; i < len; i++) {
                TreeNode node = linkedList.removeFirst();
                sum += node.val;
                if (node.left != null) {
                    linkedList.addLast(node.left);
                }
                if (node.right != null) {
                    linkedList.addLast(node.right);
                }
            }
            result.add(sum / len);
        }
        return result;
    }
}
