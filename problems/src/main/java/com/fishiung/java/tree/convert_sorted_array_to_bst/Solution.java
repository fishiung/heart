package com.fishiung.java.tree.convert_sorted_array_to_bst;

import com.fishiung.java.tree.TreeNode;

/**
 * 给你一个整数数组 nums ，其中元素已经按 升序 排列，请你将其转换为一棵 高度平衡 二叉搜索树。
 * <p>
 * 高度平衡 二叉树是一棵满足「每个节点的左右两个子树的高度差的绝对值不超过 1 」的二叉树。
 * <p>
 * 链接：https://leetcode-cn.com/problems/convert-sorted-array-to-binary-search-tree
 */
public class Solution {

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null) {
            return null;
        }
        return buildTree(nums, 0, nums.length - 1);
    }

    /**
     * 每次选出中间的（双数为右边)为根节点
     *
     * @param nums nums
     * @param left 左边界
     * @param right 右边界
     * @return 当前的根节点
     */
    private TreeNode buildTree(int[] nums, int left, int right) {
        if (left >= right) {
            return null;
        }

        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(nums[mid]);

        root.left = buildTree(nums, left, mid - 1);
        root.right = buildTree(nums, mid + 1, right);
        return root;
    }

}
