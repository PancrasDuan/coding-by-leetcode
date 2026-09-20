package cn.pancras.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： pancras
 * @date： 2026/9/20
 * @description：https://leetcode.cn/problems/merge-intervals/description/
 * @modifiedBy：
 * @version: 1.0
 */
public class Leetcode56 {

    private Solution solution = new Solution();

    public int[][] solution(int[][] intervals) {
        return solution.merge(intervals);
    }

    private class Solution {
        public int[][] merge(int[][] intervals) {

            Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));

            List<int[]> res = new ArrayList<>(intervals.length);
            for (int i = 0; i < intervals.length; i++) {
                int min = intervals[i][0], max = intervals[i][1];
                if (res.isEmpty() || res.getLast()[1] < min) {
                    res.add(new int[]{min, max});
                } else {
                    res.getLast()[1] = Math.max(res.getLast()[1], max);
                }

            }

            return res.toArray(new int[res.size()][]);
        }
    }
}
