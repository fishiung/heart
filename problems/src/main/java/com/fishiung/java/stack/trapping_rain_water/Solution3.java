package com.fishiung.java.stack.trapping_rain_water;

/**
 * 暴力求解
 * <p>
 * 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，
 * 计算按此排列的柱子，下雨之后能接多少雨水
 */
public class Solution3 {


    public int trap(int[] height) {
        if (height == null || height.length < 3) {
            return 0;
        }
        int sum = 0;
        for (int i = 1; i < height.length - 1; i++) {
            int leftMax = height[i], rightMax = height[i];
            for (int j = 0; j < i; j++) {
                if (height[j] > leftMax) {
                    leftMax = height[j];
                }
            }
            for (int j = i + 1; j < height.length; j++) {
                if (height[j] > rightMax) {
                    rightMax = height[j];
                }
            }
            sum += Math.min(leftMax, rightMax) - height[i];
        }

        return sum;
    }
}
