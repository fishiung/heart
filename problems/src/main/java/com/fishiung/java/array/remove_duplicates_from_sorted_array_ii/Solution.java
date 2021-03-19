package com.fishiung.java.array.remove_duplicates_from_sorted_array_ii;

/**
 * 给定一个增序排列数组 nums ，
 * 你需要在 原地 删除重复出现的元素，
 * 使得每个元素最多出现两次，返回移除后数组的新长度。
 * <p>
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 *
 * @author yuyang on 2021-02-27
 */

public class Solution {
    //输入：nums = [1,1,1,2,2,3]  最多重复2个
    //输出：5, nums = [1,1,2,2,3]
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int j = 0;
        int num = 0;
        int max = 2;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[j]) {
                nums[++j] = nums[i];
                num = 0;
            }
            //覆盖值
            else if (++num < max) {
                nums[++j] = nums[i];
            }
        }

        return j + 1;
    }
}
