package com.fishiung.java.array.remove_duplicates_from_sorted_array_ii;

/**
 * @author yuyang on 2021-02-27
 */

public class Solution2 {

    //跳过重复元素 直接覆盖掉 双指针的一种
    public int removeDuplicates(int[] nums) {

        if (nums == null) {
            return 0;
        }

        int i = 0;

        for (int num : nums) {
            if (i < 2 || num > nums[i - 2]) {
                nums[i++] = num;
            }
        }

        return i;
    }
}
