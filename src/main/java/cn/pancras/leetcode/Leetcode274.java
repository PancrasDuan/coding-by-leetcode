package cn.pancras.leetcode;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： Duanpengqi
 * @date： 2024/3/18
 * @description：
 * @modifiedBy：
 * @version: 1.0
 */
public class Leetcode274 {
    
    
    private Solution solution = new Solution();
    
    public int solution(int[] citations) {
        return solution.hIndex(citations);
    }
    
    // 这题真没看懂，题目都没看懂
    private class Solution {
        public int hIndex(int[] citations) {
            if (citations.length == 0) return 0;
            
            int l = 0, r = citations.length;
            while (l < r) {
                int mid = l + r + 1 >> 1;
                if (check(citations, mid)) {
                    l = mid;
                } else {
                    r = mid - 1;
                }
                
                
            }
            
            return r;
        }
        
        private boolean check(int[] citations, int mid) {
            int ans = 0;
            
            for (int i = 0; i < citations.length; i++) {
                if (citations[i] >= mid) {
                    ans++;
                }
            }
            
            
            return ans >= mid;
        }
    }
    
}
