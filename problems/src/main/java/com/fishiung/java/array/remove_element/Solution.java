package com.fishiung.java.array.remove_element;

/**
 * @author yuyang on 2021-02-27
 */

public class Solution {

    //双端指针
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            if (nums[i] == val) {
                nums[i] = nums[j--];
            } else {
                i++;
            }
        }

        return i;
    }
}
