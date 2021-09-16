package com.suanfa.demo.math;

/**
 * Description 缺失一个正整数
 * Create by 汪迎春
 * Date 2021/7/24 3:59 下午
 */
public class Math41 {
    public static void main(String[] args) {
        int[] nums = {1,1};
        System.out.println(firstMissingPositive(nums));
    }

    public static int firstMissingPositive(int[] nums) {
        int len = nums.length;
        // 负数转化
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]<=0) {
                nums[i] = len + 1;
            }
        }
        // 标记
        for (int j = 0; j < nums.length; j++) {
            int num = Math.abs(nums[j]);
            if (num <= len) {
                nums[num - 1] = -Math.abs(nums[num - 1]);
            }
        }
        // 寻找最小正整数
        for (int k = 0; k < nums.length; k++) {
            if (nums[k]>0) {
                return k + 1;
            }
        }
        return len + 1;
    }

}
