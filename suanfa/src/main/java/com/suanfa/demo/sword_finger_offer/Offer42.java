package com.suanfa.demo.sword_finger_offer;

/**
 * Description 剑指 Offer 42. 连续子数组的最大和
 * Create by 汪迎春
 * Date 2021/9/12 11:10 上午
 */
public class Offer42 {
    public static void main(String[] args) {
        int[] arr = {-1,-2};
        System.out.println(maxSubArray(arr));
    }

    public static int maxSubArray(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];
        dp[0] = nums[0];
        if (len==1) {
            return dp[0];
        }

        int maxValue = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (dp[i - 1] > 0) {
                dp[i] = nums[i] + dp[i - 1];
            } else {
                dp[i] = nums[i];
            }
            maxValue = Math.max(dp[i], maxValue);
        }
        return maxValue;
    }
}
