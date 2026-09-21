package cn.pancras.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： pancras
 * @date： 2026/9/21
 * @description：https://leetcode.cn/problems/longest-substring-without-repeating-characters/description/
 * @modifiedBy：
 * @version: 1.0
 */
public class Leetcode3 {

    private Solution solution = new Solution();

    public int solution(String s) {
        return solution.lengthOfLongestSubstring(s);
    }

    /**
     * i：当前子串的左端。
     * j：下一个准备加入的字符位置。
     * set：恰好包含 s[i..j) 中的字符，而且这段子串没有重复字符。
     */
    private class Solution {
        public int lengthOfLongestSubstring(String s) {
            if (s == null || s.length() == 0) {
                return 0;
            }
            if (s.length() == 1) {
                return 1;
            }

            int res = 0;
            char[] charArray = s.toCharArray();
            Set<Character> set = new HashSet<>();
            for (int i = 0, j = 0; i < charArray.length; i++) {

                while (j < charArray.length) {
                    if (set.contains(charArray[j])) {
                        set.remove(charArray[i]);
                        break;
                    } else {
                        set.add(charArray[j]);
                        j++;
                        res = Math.max(res, j - i);
                    }
                }

            }

            return res;
        }
    }
}
