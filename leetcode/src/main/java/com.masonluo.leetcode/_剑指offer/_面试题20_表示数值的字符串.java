package com.masonluo.leetcode._剑指offer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Masonluo
 * @date 2020-09-02 08:36
 */
public class _面试题20_表示数值的字符串 {

    public enum CharType {
        BLANK,
        SIGN,
        NUMBER,
        DOT,
        SYMBOL;
    }

    public static boolean isNumber(String s) {
        Map[] states = {
                new HashMap() {{
                    put(CharType.BLANK, 0);
                    put(CharType.SIGN, 1);
                    put(CharType.NUMBER, 2);
                    put(CharType.DOT, 4);
                }},
                new HashMap() {{
                    put(CharType.NUMBER, 2);
                    put(CharType.DOT, 4);
                }},
                new HashMap() {{
                    put(CharType.NUMBER, 2);
                    put(CharType.SYMBOL, 5);
                    put(CharType.DOT, 3);
                    put(CharType.BLANK, 8);
                }},
                new HashMap() {{
                    put(CharType.NUMBER, 3);
                    put(CharType.SYMBOL, 5);
                    put(CharType.BLANK, 8);
                }},
                new HashMap() {{
                    put(CharType.NUMBER, 3);
                }},
                new HashMap() {{
                    put(CharType.SIGN, 6);
                    put(CharType.NUMBER, 7);
                }},
                new HashMap() {{
                    put(CharType.NUMBER, 7);
                }},
                new HashMap() {{
                    put(CharType.NUMBER, 7);
                    put(CharType.BLANK, 8);
                }},
                new HashMap() {{
                    put(CharType.BLANK, 8);
                }}
        };

        int p = 0;
        for (char c : s.toCharArray()) {
            CharType charType = getCharType(c);
            if (!states[p].containsKey(charType)) return false;
            p = (Integer) states[p].get(charType);
        }
        return p == 2 || p == 3 || p == 7 || p == 8;
    }

    public static CharType getCharType(char c) {
        if (c == ' ') {
            return CharType.BLANK;
        }
        if (c == 'e' || c == 'E') {
            return CharType.SYMBOL;
        }
        if (c == '-' || c == '+') {
            return CharType.SIGN;
        }
        if (c == '.') {
            return CharType.DOT;
        }
        if (c >= '0' && c <= '9') {
            return CharType.NUMBER;
        }
        return null;
    }
}
