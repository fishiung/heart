package com.fishiung.java.array.remove_duplicates_from_sorted_array;

/**
 * @author yuyang on 2021-02-27
 */

public class Solution {
    //[0,0,1,1,1,2,2,3,3,4]
    //重复删除 可以选择移动不重复的数据
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            // 不重复的时候
            if (nums[i] != nums[j]) {
                nums[++j] = nums[i];
            }
            //重复的时候跳过
        }
        return j + 1;
    }
}
