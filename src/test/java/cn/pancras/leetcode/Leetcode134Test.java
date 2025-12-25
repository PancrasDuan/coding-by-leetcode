package cn.pancras.leetcode;

import org.junit.Test;

public class Leetcode134Test {

    private Leetcode134 leetcode134 = new Leetcode134();

    @Test
    public void test() {
        int[] gas = new int[]{1,2,3,4,5};
        int[] cost = new int[]{3,4,5,1,2};
        int solution = leetcode134.solution(gas, cost);
        System.out.println(solution);

    }

}
