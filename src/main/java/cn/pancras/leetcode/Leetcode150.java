package cn.pancras.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： pancras
 * @date： 2026/10/14
 * @description：逆波兰表达式求值 https://leetcode.cn/problems/evaluate-reverse-polish-notation/description/
 * @modifiedBy：
 * @version: 1.0
 */
public class Leetcode150 {

    private Solution solution = new Solution();

    public int solution(String[] tokens) {
        return solution.evalRPN(tokens);
    }

    /**
     * #150 的做法就是你说的那个栈，具体步骤：
     *
     * 1. 建一个栈 `Deque<Integer> stack = new ArrayDeque<>();`。
     * 2. 遍历每个 `token`：
     *    - 如果是 `"+"`、`"-"`、`"*"`、`"/"` 之一，先 `int b = stack.pop();`，再 `int a = stack.pop();`，按运算符算出 `a op b`，把结果 `push` 回去。
     *    - 否则就是数字，`stack.push(Integer.parseInt(token));`。
     * 3. 遍历结束，返回 `stack.pop()`。
     *
     * 运算那步可以用 `switch`：
     *
     * ```java
     * switch (token) {
     *     case "+": stack.push(a + b); break;
     *     case "-": stack.push(a - b); break;
     *     case "*": stack.push(a * b); break;
     *     case "/": stack.push(a / b); break;
     * }
     * ```
     *
     * 有两个坑：
     * - 先弹出来的是 `b`，也就是右操作数，顺序反了的话减法和除法会算错。
     * - 判断运算符要比较整个字符串，`"-11"` 是负数，不是减号。
     *
     * 复杂度：时间 O(n)，空间 O(n)。
     *
     * 总结一下：遇到数字就入栈，遇到运算符就弹出两个数，算完再压回去。写完提交 `Leetcode150.java`，我来核对。
     */
    private class Solution {
        public int evalRPN(String[] tokens) {

            Deque<Integer> stack = new ArrayDeque<>();
            Set<String> set = new HashSet<>();
            set.add("+");
            set.add("-");
            set.add("*");
            set.add("/");

            for (String token : tokens) {
                if (set.contains(token)) {
                    Integer rightNum = stack.pop();
                    Integer leftNum = stack.pop();
                    switch (token) {
                        case "+":
                            stack.push(leftNum + rightNum);
                            break;
                        case "-":
                            stack.push(leftNum - rightNum);
                            break;
                        case "*":
                            stack.push(leftNum * rightNum);
                            break;
                        case "/":
                            stack.push(leftNum / rightNum);
                            break;
                    }
                } else {
                    stack.push(Integer.parseInt(token));
                }
            }

            return stack.pop();
        }
    }
}
