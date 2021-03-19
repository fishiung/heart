package com.springboot.demo.util;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.condition.OS.LINUX;
import static org.junit.jupiter.api.condition.OS.MAC;

@DisplayName("数学工具测试")
class MathUtilsTest {

    @Test
    void sum() {
        int[] nums = {1, 2, 3};
        assertEquals(6, MathUtils.sum(nums));
    }


    @Test
    @EnabledOnJre(JRE.JAVA_8)
    @EnabledOnOs(MAC)
    void asserts() {
        int a = 2;
        int b = 2;
        assertEquals(a, b, () -> "a要等于b");
    }

    @Disabled("重复")
    @EnabledOnOs(LINUX)
    @Test
    void asserts2() {
        int a = 2;
        int b = 2;
        assertEquals(a, b, () -> "a要等于b");
    }
}