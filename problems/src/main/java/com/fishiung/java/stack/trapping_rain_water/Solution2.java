package com.fishiung.java.stack.trapping_rain_water;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 单调栈法
 * 形成低洼就会积水-单挑递减栈
 * <p>
 * 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，
 * 计算按此排列的柱子，下雨之后能接多少雨水
 */
public class Solution2 {


    public int trap(int[] height) {
        if (height == null || height.length < 3) {
            return 0;
        }

        int sum = 0;
        Deque<Integer> stack = new LinkedList<>();

        for (int i = 0; i < height.length; i++) {
            while (!stack.isEmpty() && height[i] > height[stack.peekLast()]) {
                int top = stack.removeLast();
                if (stack.isEmpty()) {
                    break;
                }
                int distance = i - stack.peekLast() - 1;
                int boundedHeight = Math.min(height[i], height[stack.peekLast()]) - height[top];
                sum += distance * boundedHeight;
            }

            stack.addLast(i);
        }

        return sum;
    }
}
