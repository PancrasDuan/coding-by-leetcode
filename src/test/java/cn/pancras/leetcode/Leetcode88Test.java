package cn.pancras.leetcode;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： Duanpengqi
 * @date： 2024/3/1
 * @description：
 * @modifiedBy：
 * @version: 1.0
 */
public class Leetcode88Test {
    
    private Leetcode88 leetcode88 = new Leetcode88();
    
    @Test
    public void test() {
        
        testExampleOne();
        
        testExampleTwo();
        
        testExampleThree();
        
        
    }
    
    
    private void testExampleOne() {
        int[] num1 = new int[]{1,2,3,0,0,0};
        int m = 3;
        int[] num2 = new int[]{2,5,6};
        int n = 3;
        leetcode88.solution(num1, m, num2,n);
        System.out.println(num1);
    }
    
    private void testExampleTwo() {
        int[] num1 = new int[]{1};
        int m = 1;
        int[] num2 = new int[]{};
        int n = 0;
        leetcode88.solution(num1, m, num2,n);
        System.out.println(num1);
    }
    
    private void testExampleThree() {
        int[] num1 = new int[]{0};
        int m = 0;
        int[] num2 = new int[]{1};
        int n = 1;
        leetcode88.solution(num1, m, num2,n);
        System.out.println(num1);
    }
    
}
