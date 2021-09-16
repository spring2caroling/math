package com.suanfa.demo.math;

/**
 * Description
 * Create by 汪迎春
 * Date 2021/7/18 3:54 下午
 */
public class Math32 {
    public static void main(String[] args) {
        String s = ")()())";
        System.out.println(longestValidParentheses(s));
    }

    /**
     * <p>
     *     状态转义方程
     *     1、碰到'('结尾肯定是0
     *     2、碰到')'，且前一位是'('，则dp[i]=dp[i-1]+2 这个很好理解
     *     3、碰到')'，且前一位是')'，
     *      如果dp[i-1]=0,则，i-dp[i-1]-1位肯定不是'('，dp[i]=0
     *      如果dp[i-1]≠0，则，需要满足i-dp[i-1]-1位是'(' 才行，这时dp[i]=2+dp[i-1],
     *         同时还要判断i-dp[i-1]-2位 是否为有效，如果是也加上，于是
     *         dp[i]=2+dp[i-1]+dp[i-dp[i-1]+2]
     * </p>
     * @param s
     * @return
     */
    public static int longestValidParentheses(String s) {
        if (s == null || s.length() <= 1) {
            return 0;
        }
        int max = 0;
        int len = s.length();
        // 初始化状态记录数组
        int[] dp = new int[len];
        dp[0] = 0;
        // 边界条件有根据字符串情况而定，因此放到循环里判断
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                dp[i] = 0;
                continue;
            }
            if (s.charAt(i) == ')') {
                // 1 前一位是 '('
                if (s.charAt(i - 1) == '(') {
                    dp[i] = i > 1 ? dp[i - 2] + 2 : 2;
                } else if (i - dp[i - 1] - 1 >= 0 && s.charAt(i - dp[i - 1] - 1) == '(') { // 2 前一位是')'
                    dp[i] = dp[i - 1] + 2 + (i - dp[i - 1] - 2 >= 0 ? dp[i - dp[i - 1] - 2] : 0);
                }
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
