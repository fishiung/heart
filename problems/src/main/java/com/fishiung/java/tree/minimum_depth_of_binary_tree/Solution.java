package com.fishiung.java.tree.minimum_depth_of_binary_tree;

import com.fishiung.java.tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 给定一个二叉树，找出其最小深度。
 * <p>
 * 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
 * <p>
 * 说明：叶子节点是指没有子节点的节点。
 */
public class Solution {


    public int minDepth(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int minDepth = 1;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(node);

        TreeNode cur;
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                cur = queue.poll();
                if (cur.left == null && cur.right == null) {
                    return minDepth;
                }
                if (cur.left != null) {
                    queue.offer(cur.left);
                }
                if (cur.right != null) {
                    queue.offer((cur.right));
                }
            }
            minDepth++;
        }

        return minDepth;
    }
}
