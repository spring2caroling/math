package com.suanfa.demo.math;

/**
 * Description
 * Create by 汪迎春
 * Date 2021/7/24 10:06 下午
 */
public class Math55 {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,0,1,1};
        System.out.println(canJump(nums));
    }

    public static boolean canJump(int[] nums) {
        int len = nums.length;
        int max = 0;
        for (int i = 0; i < len; i++) {
            if (i <= max) {
                max = Math.max(max, i + nums[i]);
                if (max >= len - 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
