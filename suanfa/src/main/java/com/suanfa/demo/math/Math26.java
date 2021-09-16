package com.suanfa.demo.math;

/**
 * Description 删除有序数组中的重复项
 * Create by 汪迎春
 * Date 2021/7/17 11:48 上午
 */
public class Math26 {

    public static void main(String[] args) {
        // 双指针
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length==1) {
            return 1;
        }

        int i = 0, j = 1;
        int len = nums.length;

        while (j < len) {
            if (nums[i] == nums[j]) {
                j++;
            } else {
                nums[++i] = nums[j];
            }
        }
        return i + 1;
    }

}
