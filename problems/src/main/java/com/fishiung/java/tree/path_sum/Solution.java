package com.fishiung.java.tree.path_sum;

import com.fishiung.java.tree.TreeNode;

/**
 * 给你二叉树的根节点root 和一个表示目标和的整数targetSum ，
 * 判断该树中是否存在 根节点到叶子节点 的路径，这条路径上所有节点值相加等于目标和targetSum 。
 * <p>
 * 叶子节点 是指没有子节点的节点。
 * <p>
 * 链接：https://leetcode-cn.com/problems/path-sum
 */
public class Solution {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        return sum(root, root.val, targetSum);
    }

    private boolean sum(TreeNode node, int sum, int tar) {
        if (node == null || (node.left == null && node.right == null)) {
            return sum == tar;
        }

        if (node.left == null) {
            return sum(node.right, sum + node.right.val, tar);
        }

        if (node.right == null) {
            return sum(node.left, sum + node.left.val, tar);
        }

        return sum(node.right, sum + node.right.val, tar)
                || sum(node.left, sum + node.left.val, tar);
    }
}
