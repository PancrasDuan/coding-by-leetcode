package cn.pancras.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode13 {

    private static final Map<Character, Integer> ROMAN_INT_MAP = new HashMap<>();

    static {
        ROMAN_INT_MAP.put('I', 1);
        ROMAN_INT_MAP.put('V', 5);
        ROMAN_INT_MAP.put('X', 10);
        ROMAN_INT_MAP.put('L', 50);
        ROMAN_INT_MAP.put('C', 100);
        ROMAN_INT_MAP.put('D', 500);
        ROMAN_INT_MAP.put('M', 1000);
    }

    private final Solution solution = new Solution();

    public int solution(String s) {
        return solution.romanToInt(s);
    }

    private static class Solution {
        public int romanToInt(String s) {
            if (s == null || s.length() == 0) {
                return 0;
            }
            char[] charArray = s.toCharArray();

            int result = 0;
            for (int i = 0; i < charArray.length; i++) {
                char currentChar = charArray[i];

                Integer res = ROMAN_INT_MAP.get(currentChar);
                if (res == null) {
                    continue;
                }

                if (i + 1 < charArray.length) {

                    char nextChar = charArray[i + 1];
                    if (currentChar == 'I' && (nextChar == 'V' || nextChar == 'X')) {
                        res = -res;
                    }

                    if (currentChar == 'X' && (nextChar == 'L' || nextChar == 'C')) {
                        res = -res;
                    }

                    if (currentChar == 'C' && (nextChar == 'D' || nextChar == 'M')) {
                        res = -res;
                    }
                }


                result += res;
            }

            return result;
        }
    }
}
