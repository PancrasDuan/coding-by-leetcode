package cn.pancras.leetcode;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： pancras
 * @date： 2026/10/17
 * @description：岛屿数量 https://leetcode.cn/problems/number-of-islands/description/
 * @modifiedBy：
 * @version: 1.0
 */
public class Leetcode200 {

    private Solution solution = new Solution();

    public int solution(char[][] grid) {
        return solution.numIslands(grid);
    }

    private class Solution {
        public int numIslands(char[][] grid) {

            int res = 0;
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    // 未被标记的陆地，代表发现一座新岛。
                    if (grid[i][j] == '1') {
                        res++;
                        dfs(grid, i, j);
                    }
                }
            }

            return res;
        }

        private void dfs(char[][] grid, int i, int j) {
            int m = grid.length;
            int n = grid[0].length;

            if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == '0') {
                return;
            }

            // 原地标记已访问，避免重复搜索；会修改输入网格。
            grid[i][j] = '0';
            dfs(grid, i - 1, j);
            dfs(grid, i + 1, j);
            dfs(grid, i, j - 1);
            dfs(grid, i, j + 1);
        }
    }
}
