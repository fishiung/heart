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
public class Solution3 {

    /**
     * TODO  非递归版本
     */
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }

        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }
}
