package com.fishiung.java.stack.valid_parentheses;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 *
 *
 * 使用Map
 *
 * @author yuyang on 2021-02-26
 */

class Solution {

    private static final Map<Character, Character> DICT = new HashMap<>();
    static {
        DICT.put(')', '(');
        DICT.put(']', '[');
        DICT.put('}', '{');
    }

    public boolean isValid(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }

        Deque<Character> stack = new LinkedList<>();
        char tmp;
        for (int i = 0; i < s.length(); i++) {
            tmp = s.charAt(i);
            if (tmp == '(' || tmp == '[' || tmp == '{') {
                stack.addLast(tmp);
            } else if (!stack.isEmpty() && DICT.containsKey(tmp)) {
                if (DICT.get(tmp).equals(stack.peekLast())) {
                    stack.removeLast();
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
