package com.fishiung.java.tree.symmetric_tree;

import com.fishiung.java.tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 树的双指针
 *
 * 非递归版本
 */
public class Solution2 {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        queue.offer(root);

        TreeNode left;
        TreeNode right;
        while (!queue.isEmpty()) {
            left = queue.poll();
            right = queue.poll();

            if (left == null && right == null) {
                continue;
            }

            if (left == null || right == null || left.val != right.val) {
                return false;
            }

            queue.offer(left.left);
            queue.offer(right.right);

            queue.offer(left.right);
            queue.offer(right.left);
        }

        return true;
    }
}
