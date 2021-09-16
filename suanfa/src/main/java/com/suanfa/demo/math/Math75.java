package com.suanfa.demo.math;

import java.util.Arrays;

/**
 * Description 颜色分类
 * Create by 汪迎春
 * Date 2021/7/30 4:41 下午
 */
public class Math75 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 0};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void sortColors(int[] nums) {
        int zero = 0;
        int two = nums.length - 1;
        int i = 0;

        while (i <= two) {
            if (nums[i] == 0) {
                swap(nums, i, zero);
                zero++;
                i++;
            } else if (nums[i] == 1) {
                i++;
            } else {
                swap(nums, i, two);
                two--;
            }
        }
    }

    private static void swap(int[] nums, int num1, int num2) {
        int temp = nums[num1];
        nums[num1] = nums[num2];
        nums[num2] = temp;
    }


}

