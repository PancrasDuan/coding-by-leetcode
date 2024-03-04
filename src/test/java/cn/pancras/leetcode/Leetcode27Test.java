package cn.pancras.leetcode;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： Duanpengqi
 * @date： 2024/3/4
 * @description：
 * @modifiedBy：
 * @version: 1.0
 */
public class Leetcode27Test {
    
    private Leetcode27 leetcode27 = new Leetcode27();
    
    @Test
    public void test() {
    
    
        testExampleOne();
        
        testExampleTwo();
    }
    
    
    private void testExampleOne() {
        int[] nums = new int[]{3,2,2,3};
        int val = 3;
        int solution = leetcode27.solution(nums, val);
        System.out.println(nums);
        System.out.println(solution);
    }
    
    private void testExampleTwo() {
        
        int[] nums = new int[]{0,1,2,2,3,0,4,2};
        int val = 2;
        int solution = leetcode27.solution(nums, val);
        System.out.println(nums);
        System.out.println(solution);
    }
    
    
}
