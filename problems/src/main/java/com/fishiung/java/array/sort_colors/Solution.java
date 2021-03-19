package com.fishiung.java.array.sort_colors;

import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;

/**
 * @author yuyang on 2021-02-27
 */

public class Solution {

    public void sortColors(int[] nums) {
        if (nums == null || nums.length < 2) {
            return;
        }

        //定义循环不变量
        //all in [0,left) = 0
        //all in [left,i) = 1
        //all in [right,nums.length -1) = 2
        int left = 0;
        int right = nums.length - 1;
        int i = 0;
        while (i <= right) {
            if (nums[i] == 0) {
                swap(nums, left++, i++);
            } else if (nums[i] == 1) {
                i++;
            }else{
                swap(nums,right--,i);
            }
        }
    }

    private void swap(int[] nums, int a, int b) {
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }
}