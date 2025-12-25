package cn.pancras.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode54 {

    private static final Solution solution = new Solution();

    public List<Integer> solution(int[][] matrix) {
        return solution.spiralOrder(matrix);
    }


    private static class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {
            if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
                return new ArrayList<>();
            }

            int rows = matrix.length, cols = matrix[0].length;
            int left = 0, right = cols - 1, top = 0, bottom = rows - 1;

            List<Integer> result = new ArrayList<>();

            while (result.size() < rows * cols) {

                // 右
                for (int i = left; i <= right; i++) {
                    if (result.size() >= cols * rows) {
                        return result;
                    }
                    result.add(matrix[top][i]);
                }
                top++;

                // 下
                for (int i = top; i <= bottom; i++) {
                    if (result.size() >= cols * rows) {
                        return result;
                    }
                    result.add(matrix[i][right]);
                }
                right--;

                // 左
                for (int i = right; i >= left; i--) {
                    if (result.size() >= cols * rows) {
                        return result;
                    }
                    result.add(matrix[bottom][i]);
                }
                bottom--;

                // 上
                for (int i = bottom; i >= top; i--) {
                    if (result.size() >= cols * rows) {
                        return result;
                    }
                    result.add(matrix[i][left]);
                }
                left++;

            }


            return result;
        }
    }
}
