package com.fishiung.java.tree.symmetric_tree;

import com.fishiung.java.tree.TreeNode;

/**
 * 树的双指针
 * <p>
 * 递归解决
 */
public class Solution {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        return check(root.left, root.right);
    }

    public boolean check(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        return p.val == q.val && check(p.left, q.right) && check(p.right, q.left);
    }
}
