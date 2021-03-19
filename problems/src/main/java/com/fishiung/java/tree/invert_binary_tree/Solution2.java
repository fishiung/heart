package com.fishiung.java.tree.invert_binary_tree;

import com.fishiung.java.tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution2 {

    /**
     * 从下到上的递归
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
