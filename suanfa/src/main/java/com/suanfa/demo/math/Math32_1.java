package com.suanfa.demo.math;

import java.util.Stack;

/**
 * Description 最长有效括号
 * Create by 汪迎春
 * Date 2021/7/18 10:18 下午
 */
public class Math32_1 {
    public static void main(String[] args) {

    }


    public static int longestValidParentheses(String s) {
        if (s==null||s.length()<=1) {
            return 0;
        }

        int max = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    max = Math.max(max, i - stack.peek());
                }
            }
        }
        return max;
    }


}
