package com.fishiung.java.tree.balanced_binary_tree;

import com.fishiung.java.tree.TreeNode;

/**
 * 给定一个二叉树，判断它是否是高度平衡的二叉树。
 * <p>
 * 本题中，一棵高度平衡二叉树定义为：一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1
 */
public class Solution {

    /**
     * 自定向下的递归  (n^2)
     */
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        return Math.abs(maxDepth(root.left) - maxDepth(root.right)) < 2 && isBalanced(root.left) && isBalanced(root.right);
    }

    private int maxDepth(TreeNode node) {
        if (node == null) {
            return 0;
        }

        return Math.max(maxDepth(node.left), maxDepth(node.right)) + 1;
    }
}
