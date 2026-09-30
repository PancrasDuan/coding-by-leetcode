package cn.pancras.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： pancras
 * @date： 2026/9/28
 * @description：字母异位词分组 https://leetcode.cn/problems/group-anagrams/description/
 * @modifiedBy：
 * @version: 1.0
 */
public class Leetcode49 {

    private Solution solution = new Solution();

    public List<List<String>> solution(String[] strs) {
        return solution.groupAnagrams(strs);
    }

    private class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {

            Map<String, List<String>> map = new HashMap<>();

            for (int i = 0; i < strs.length ; i++) {
                String s = strs[i];
                char[] chars = s.toCharArray();
                Arrays.sort(chars);
                String key = String.valueOf(chars);
                if (!map.containsKey(key)) {
                    map.put(key, new ArrayList<>());
                }
                map.get(key).add(s);
            }


            return new ArrayList<>(map.values());
        }
    }
}
