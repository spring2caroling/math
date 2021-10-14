package com.suanfa.demo.sword_finger_offer;

import java.util.Arrays;

/**
 * Description 剑指 Offer 57. 和为s的两个数字
 * Create by 汪迎春
 * Date 2021/9/18 8:56 上午
 */
public class Offer57 {
    public static void main(String[] args) {
        //对撞双指针，指针在数组两头向中间靠拢
        int[] arr = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(arr, 9)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;

        while (i < j) {
            if (nums[i] + nums[j] > target) {
                j--;
            } else if (nums[i] + nums[j] < target) {
                i++;
            } else {
                return new int[] {nums[i], nums[j]};
            }
        }
        return new int[0];
    }
}
