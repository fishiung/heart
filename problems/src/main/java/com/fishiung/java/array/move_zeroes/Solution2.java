package com.fishiung.java.array.move_zeroes;

/**
 * @author yuyang on 2021-02-27
 */

public class Solution2 {

    //另一种双指针思想
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length < 2) {
            return;
        }

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        for (; j < nums.length; j++) {
            nums[j] = 0;
        }
    }
}