package com.fishiung.java.tree.maximum_depth_of_binary_tree;

import com.fishiung.java.tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 非递归版本 bfs
 */
public class Solution2 {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int depth = 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size > 0) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
                size--;
            }
            depth++;
        }

        return depth;
    }
}
