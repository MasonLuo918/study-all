package com.masonluo.leetcode.二叉树;

import com.masonluo.leetcode.Base.TreeNode;

/**
 * @author Masonluo
 * @date 2020-10-20 15:21
 */
public class BinaryTree {

    public static TreeNode constructBinaryTree(String str) {
        if (str.length() == 0) {
            return null;
        }
        TreeNode root;
        // 如果是#，直接返回一个null
        if (str.charAt(0) == '#') {
            return null;
        }
        int num = str.charAt(0) - '0';
        root = new TreeNode(num);
        int[] nowIdx = new int[1];
        String left = split(str, 1, nowIdx);
        String right = split(str, nowIdx[0] + 1, nowIdx);
        root.left = constructBinaryTree(left);
        root.right = constructBinaryTree(right);
        return root;
    }

    private static String split(String str, int startIdx, int[] nowIdx) {
        int left = 0;
        if (startIdx >= str.length()) {
            return "";
        }
        for (int i = startIdx; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                left++;
            } else if (str.charAt(i) == ')') {
                left--;
            }
            if (left == 0) {
                nowIdx[0] = i;
                break;
            }
        }
        return str.substring(startIdx + 1, nowIdx[0]);
    }

    public static void main(String[] args) {
        TreeNode root = constructBinaryTree("1(2(4)(5))(3)");
        System.out.println(root);
    }
}
