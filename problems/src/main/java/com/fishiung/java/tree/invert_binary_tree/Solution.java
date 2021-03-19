package com.fishiung.java.tree.invert_binary_tree;

import com.fishiung.java.tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        TreeNode node, tmp;
        while (!queue.isEmpty()) {
            node = queue.poll();
            tmp = node.left;
            node.left = node.right;
            node.right = tmp;

            if (node.left != null) {
                queue.offer(node.left);
            }

            if (node.right != null) {
                queue.offer(node.right);
            }
        }

        return root;
    }
}
