package com.fishiung.java.tree.maximum_depth_of_binary_tree;

import com.fishiung.java.tree.TreeNode;

public class Solution {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
