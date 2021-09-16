package com.suanfa.demo.math;

/**
 * Description
 * Create by 汪迎春
 * Date 2021/7/19 9:53 上午
 */
public class Math38 {
    public static void main(String[] args) {
        int count = 4;
        System.out.println(countAndSay(count));
    }

    public static String countAndSay(int n) {
        String[] dp = new String[n];
        dp[0] = "1";
        if (n==1) {
            return dp[0];
        }

        for (int i = 1; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            String str = dp[i - 1];
            char[] chars = str.toCharArray();
            char pre = chars[0];

            for (int j = 0; j < chars.length; j++) {
                int count = 0;
                pre = chars[j];

                while (j < chars.length && chars[j] == pre) {
                    count++;
                    j++;
                }
                j--;
                sb.append(count).append(pre);
            }
            dp[i] = sb.toString();
        }
        return dp[n-1];
    }

}
