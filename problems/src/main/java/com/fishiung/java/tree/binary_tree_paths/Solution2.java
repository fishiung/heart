package com.fishiung.java.tree.binary_tree_paths;

import com.fishiung.java.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * StringBuilder 优化到 1ms
 * 给定一个二叉树，返回所有从根节点到叶子节点的路径。
 * <p>
 * 说明: 叶子节点是指没有子节点的节点。
 */
public class Solution2 {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }

        dfs(root, ans, new StringBuilder().append(root.val));
        return ans;
    }

    private void dfs(TreeNode node, List<String> ans, StringBuilder sb) {
        if (node.left == null && node.right == null) {
            ans.add(sb.toString());
            return;
        }

        if (node.left != null) {
            dfs(node.left, ans, new StringBuilder(sb.toString()).append("->").append(node.left.val));
        }
        if (node.right != null) {
            dfs(node.right, ans, new StringBuilder(sb.toString()).append("->").append(node.right.val));
        }
    }
}
