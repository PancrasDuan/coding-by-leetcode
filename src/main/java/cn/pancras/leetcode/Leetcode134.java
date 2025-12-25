package cn.pancras.leetcode;

public class Leetcode134 {

    private Solution solution = new Solution();

    public int solution(int[] gas, int[] cost) {
        return solution.canCompleteCircuit(gas, cost);
    }

    private class Solution {
        public int canCompleteCircuit(int[] gas, int[] cost) {
            int result = -1;
            if (gas.length == 0) {
                return result;
            }
            int n = gas.length;

            for (int i = 0; i < n; i++) {
                int remain = gas[i] - cost[i];
                int j = i;

                while (remain >= 0) {
                    j = (j + 1) % n;
                    remain = remain + gas[j] - cost[j];

                    if (i == j) {
                        result = i;
                        break;
                    }
                }

            }

            return result;
        }
    }
}
