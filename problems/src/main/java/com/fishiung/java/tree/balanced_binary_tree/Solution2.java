package com.fishiung.java.tree.balanced_binary_tree;

import com.fishiung.java.tree.TreeNode;

/**
 * 给定一个二叉树，判断它是否是高度平衡的二叉树。
 * <p>
 * 本题中，一棵高度平衡二叉树定义为：一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1
 */
public class Solution2 {

    public boolean isBalanced(TreeNode root) {
        return maxDepth(root) != -1;
    }

    private int maxDepth(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int l = maxDepth(node.left);
        int r = maxDepth(node.right);
        if (l == -1 || r == -1 || Math.abs(l - r) > 1) {
            return -1;
        }

        return Math.max(l, r) + 1;
    }
}
