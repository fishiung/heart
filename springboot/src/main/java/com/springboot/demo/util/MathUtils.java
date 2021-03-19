package com.springboot.demo.util;


/**
 * @author yuyang on 2021-03-10
 */

public final class MathUtils {

    private MathUtils() {}

    public static int sum(int... nums) {
        if (nums == null) {
            return 0;
        }

        long sum = 0;

        for (int num : nums) {
            sum += num;
        }

        if (sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE) {
            throw new IllegalArgumentException("计算结果=" + sum + "超出int范围");
        }

        return (int) sum;
    }
}
