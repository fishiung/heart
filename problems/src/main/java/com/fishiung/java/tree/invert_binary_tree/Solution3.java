package com.fishiung.java.tree.invert_binary_tree;

import com.fishiung.java.tree.TreeNode;

public class Solution3 {

    /**
     * TODO
     * 从上到下的递归
     * 递归版本
     */
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode r = invertTree(root.right);
        TreeNode l = invertTree(root.left);

        root.right = l;
        root.left = r;
        return root;
    }
}
