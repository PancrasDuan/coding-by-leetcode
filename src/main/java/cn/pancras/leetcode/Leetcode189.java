package cn.pancras.leetcode;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： Duanpengqi
 * @date： 2024/3/7
 * @description：
 * @modifiedBy：
 * @version: 1.0
 */
public class Leetcode189 {

    private Solution solution = new Solution();
    
    
    public void solution(int[] nums, int k) {
        solution.rotate(nums, k);
    }
    
    /**
     * 方法一：使用额外的数组
     * 思路就是创建一个数据存储最终结果，之后赋值给原数组
     * 时间复杂度为 2n
     * 空间复杂度为 n
     */
    private class Solution {
        public void rotate(int[] nums, int k) {
            // k为非负数  k>=0
            if (k == 0) {
                return;
            }
            
            // 长度为1 不需要移动
            if (nums.length == 1) {
                return;
            }
            
            
            int[] finalList = new int[nums.length];
            
            for (int i = 0; i < nums.length; i++) {
                int index = i + k;
                if (i + k >= nums.length) {
                    index = index % nums.length;
                }
                
                
                finalList[index] = nums[i];
            }
            
            for (int i = 0; i < nums.length; i++) {
                nums[i] = finalList[i];
            }
            
            
        }
    }
    
    
    /**
     * 方法二：环状替换
     */
    private class Solution1 {
        public void rotate(int[] nums, int k) {
            
            // todo
            
        }
    }
    
    
    /**
     * 方法三：数组翻转
     * 如 [1,2,3,4,5] k=2
     * 可以先反转数组为 [5,4,3,2,1]
     * 数组可以根据k 分为 [5,4]  [3,2,1]
     *
     * 左右数组分别反转为 [4,5] [1,2,3]
     * 合在一起就是 [4,5,1,2,3]
     */
    private class Solution2 {
        public void rotate(int[] nums, int k) {
            // k为非负数  k>=0
            if (k == 0) {
                return;
            }
            
            // 长度为1 不需要移动
            if (nums.length == 1) {
                return;
            }
            
            
            k = k % nums.length;
            reverse(nums, 0, nums.length-1);
            reverse(nums, 0, k-1);
            reverse(nums, k, nums.length-1);
            
            
        }
        
        private void reverse(int[] nums, int begin, int end) {
            while (begin < end) {
                
                int tmp = nums[begin];
                nums[begin] = nums[end];
                nums[end] = tmp;
                
                begin++;
                end--;
                
                
            }
            
            
        }
    }
}
