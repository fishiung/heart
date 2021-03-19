package com.fishiung.java.stack.trapping_rain_water;

/**
 * 双指针法
 * 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，
 * 计算按此排列的柱子，下雨之后能接多少雨水
 */
public class Solution {


    public int trap(int[] height) {
        if (height == null || height.length < 3) {
            return 0;
        }

        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int sum = 0;

        while (left < right) {
            //如果左边的高度小于右边的高度，那么 lefMax -height[left]的差都是结果
            if (height[left] < height[right]) {
                //大于左边最大值更新leftMax
                if (height[left] > leftMax) {
                    leftMax = height[left];
                }
                //造成局部低洼 先加入结果
                else {
                    sum += leftMax - height[left];
                }
                left ++;
            }else{
                if (height[right] > rightMax) {
                    rightMax = height[right];
                }
                else {
                    sum += rightMax - height[right];
                }
                right --;
            }
        }
        return sum;
    }
}
