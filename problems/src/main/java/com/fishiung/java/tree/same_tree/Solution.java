package com.fishiung.java.tree.same_tree;

import com.fishiung.java.tree.TreeNode;

/**
 * 给你两棵二叉树的根节点 p 和 q ，编写一个函数来检验这两棵树是否相同。
 * <p>
 * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
 */
public class Solution {

    /**
     * 同时先序遍历，结果不同直接返回
     *
     * @param p p
     * @param q q
     * @return 是否相同
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        }

        StringBuilder pBuilder = new StringBuilder();
        StringBuilder qBuilder = new StringBuilder();
        pre(qBuilder, q);
        pre(pBuilder, p);
        return qBuilder.toString().equals(pBuilder.toString());
    }

    private void pre(StringBuilder builder, TreeNode node) {
        if (node == null) {
            builder.append("#,");
            return;
        }

        builder.append(node.val).append(",");
        pre(builder, node.left);
        pre(builder, node.right);
    }
}
