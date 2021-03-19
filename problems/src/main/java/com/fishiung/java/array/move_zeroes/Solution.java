package com.fishiung.java.array.move_zeroes;

/**
 * @author yuyang on 2021-02-27
 */

public class Solution {

    //双指针   快速排序思想
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length < 2) {
            return;
        }

        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i > j) {
                    nums[j] = nums[i];
                    nums[i] = 0;
                }
                j++;
            }
        }
    }
}