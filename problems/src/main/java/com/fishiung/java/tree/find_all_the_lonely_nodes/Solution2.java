package com.fishiung.java.tree.find_all_the_lonely_nodes;

import com.fishiung.java.tree.TreeNode;

import java.util.*;

/**
 * 非递归解决
 * <p>
 * 二叉树中，如果一个节点是其父节点的唯一子节点，则称这样的节点为 “独生节点” 。
 * 二叉树的根节点不会是独生节点，因为它没有父节点。
 * <p>
 * 给定一棵二叉树的根节点root ，返回树中 所有的独生节点的值所构成的数组 。数组的顺序 不限 。
 * <p>
 * 链接：https://leetcode-cn.com/problems/find-all-the-lonely-nodes
 */
public class Solution2 {

    public List<Integer> getLonelyNodes(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Deque<TreeNode> stack = new ArrayDeque<>();
        stack.addLast(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.removeLast();
            if (node.right == null && node.left != null) {
                result.add(node.left.val);
                stack.addLast(node.left);
            } else if (node.left == null && node.right != null) {
                result.add(node.right.val);
                stack.addLast(node.right);
            } else if (node.left != null) {
                stack.addLast(node.left);
                stack.addLast(node.right);
            }
        }
        return result;
    }
}
