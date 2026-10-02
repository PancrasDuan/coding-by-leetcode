package cn.pancras.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： pancras
 * @date： 2026/10/2
 * @description：找到字符串中所有字母异位词 https://leetcode.cn/problems/find-all-anagrams-in-a-string/description/
 * @modifiedBy：
 * @version: 1.0
 */
public class Leetcode438 {

    private Solution solution = new Solution();

    public List<Integer> solution(String s, String p) {
        return solution.findAnagrams(s, p);
    }

    /**
     * #438 整体思路（固定窗口 + 计数数组）：
     *
     * 记 n = s.length()、m = p.length()。如果 n < m，直接返回空列表。
     * 建两个长度 26 的数组：need 记 p 里每个字母的次数，win 记当前窗口里每个字母的次数。
     * 遍历 right 从 0 到 n-1：
     * 进：win[s[right] - 'a']++。
     * 出：如果 right >= m，说明窗口超长了，win[s[right - m] - 'a']--。
     * 判断：如果 right >= m - 1 且 Arrays.equals(need, win)，就把起点 right - m + 1 加进结果。
     * 返回结果列表。
     * 坑：
     *
     * 窗口刚好凑满 m 个字符时才能判断，所以判断条件是 right >= m - 1。
     * 出窗口的下标是 right - m，别写成 right - m + 1。
     * 复杂度：每步比较数组是 26 次，所以时间是 O(26·n)，空间是 O(1)。
     */
    private class Solution {
        public List<Integer> findAnagrams(String s, String p) {
            if (s.length() < p.length()) {
                return new ArrayList<>();
            }

            int[] counts = new int[26];
            for (char c : p.toCharArray()) {
                counts[c - 'a']++;
            }

            List<Integer> result = new ArrayList<>();
            int left = 0, right = 0;
            int[] dynamic = new int[26];
            while (right < s.length()) {
                dynamic[s.charAt(right) - 'a']++;
                right++;

                // 窗口不合法
                if (right - left != p.length()) {
                    continue;
                }

                // 合法
                if (Arrays.equals(counts, dynamic)) {
                    result.add(left);
                }

                // 处理位移
                dynamic[s.charAt(left) - 'a']--;
                left++;

            }

            return result;
        }
    }
}
