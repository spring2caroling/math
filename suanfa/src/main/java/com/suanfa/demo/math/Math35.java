package com.suanfa.demo.math;

/**
 * Description
 * Create by 汪迎春
 * Date 2021/7/18 10:39 下午
 */
public class Math35 {
    public static void main(String[] args) {
        int[] nums = {1};
        int target = 1;
        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        if (nums==null||nums.length==0) {
            return 0;
        }
        int len = nums.length;
        int index = len;
        if (target==nums[len-1]) {
            return len - 1;
        }
        if (target > nums[len - 1]) {
            return len;
        }
        int left = 0;
        int right = len - 1;
        while (left <= right) {
            int mid = ((right - left) >> 1) + left;
            if (nums[mid] >= target) {
                index = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return index;
    }

}
