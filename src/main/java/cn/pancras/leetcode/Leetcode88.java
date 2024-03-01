package cn.pancras.leetcode;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： Duanpengqi
 * @date： 2024/3/1
 * @description：https://leetcode.cn/problems/merge-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
 * @modifiedBy：
 * @version: 1.0
 */
public class Leetcode88 {
    
    private Solution solution = new Solution();
    
    public void solution(int[] nums1, int m, int[] nums2, int n) {
        solution.merge(nums1, m, nums2, n);
    }
}


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int a = m-1, b= n-1;
        int t = m+n-1;
        
        while(a>=0 || b>=0) {
            if(a==-1) {
                nums1[t]=nums2[b];
                b--;
                t--;
            } else if(b==-1) {
                break;
            } else {
                int tail1 = nums1[a];
                int tail2 = nums2[b];
                
                if(tail1<tail2) {
                    nums1[t] = tail2;
                    b--;
                } else {
                    nums1[t] = tail1;
                    a--;
                }
                
                t--;
            }
        }
        
    }
}


