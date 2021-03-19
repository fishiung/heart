package com.fishiung.java.tree.binary_tree_paths;

import com.fishiung.java.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 6ms
 *
 * 给定一个二叉树，返回所有从根节点到叶子节点的路径。
 * <p>
 * 说明: 叶子节点是指没有子节点的节点。
 */
public class Solution {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }

        dfs(root, ans, String.valueOf(root.val));
        return ans;
    }

    private void dfs(TreeNode node, List<String> ans, String str) {
        if (node.left == null && node.right == null) {
            ans.add(str);
            return;
        }

        if (node.left != null) {
            dfs(node.left, ans, str + "->" + node.left.val);
        }
        if (node.right != null) {
            dfs(node.right, ans, str + "->" + node.right.val);
        }
    }
}
