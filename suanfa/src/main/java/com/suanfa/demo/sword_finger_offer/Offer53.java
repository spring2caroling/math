package com.suanfa.demo.sword_finger_offer;

/**
 * Description 剑指 Offer 53 - I. 在排序数组中查找数字 I
 * Create by 汪迎春
 * Date 2021/8/31 1:49 下午
 */
public class Offer53 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,2};
        System.out.println(search(arr, 1));
    }

    public static int search(int[] nums, int target) {
        if (nums==null||nums.length==0) {
            return 0;
        }
        int len = nums.length;
        int left = 0;
        int right = len - 1;
        int count = 0;

        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                // 这里向左 向右
                int num1 = mid;
                int num2 = mid;
                while (num1 >= 0 && nums[num1] == target) {
                    count++;
                    num1--;
                }
                while ((num2 <= len - 1) && nums[num2] == target) {
                    count++;
                    num2++;
                }
                break;
            }
        }
        return count == 0 ? 0 : --count;
    }
}
