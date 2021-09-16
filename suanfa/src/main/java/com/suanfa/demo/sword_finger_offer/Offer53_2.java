package com.suanfa.demo.sword_finger_offer;

/**
 * Description 剑指 Offer 53 - II. 0～n-1中缺失的数字
 * Create by 汪迎春
 * Date 2021/8/31 2:25 下午
 */
public class Offer53_2 {

    public static void main(String[] args) {
        int[] arr = {0};
        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] nums) {
        if (nums[0]!=0) {
            return 0;
        }

        int len = nums.length;
        int left = 0;
        int right = len - 1;
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] == mid) {
                left = mid + 1;
            } else if (mid >= 1 && nums[mid] != mid && nums[mid - 1] == mid - 1) {
                return mid;
            } else {
                right = mid - 1;
            }
        }
        return len;
    }

    public static int miss(int[] nums) {
        int i = 0, j = nums.length - 1;
        while(i <= j) {
            int m = (i + j) / 2;
            if(nums[m] == m) i = m + 1;
            else j = m - 1;
        }
        return i;
    }
}
