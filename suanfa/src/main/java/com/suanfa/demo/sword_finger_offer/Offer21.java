package com.suanfa.demo.sword_finger_offer;

/**
 * Description
 * Create by 汪迎春
 * Date 2021/9/17 12:10 上午
 */
public class Offer21 {
    public static void main(String[] args) {

    }

    public static int[] exchange(int[] nums) {
        int i = 0 ;
        int j = nums.length - 1;

        while (i < j) {
            while (i < j && (nums[i] & 1) == 1) {
                i++;
            }
            while (i < j && (nums[j] & 1) == 0) {
                j--;
            }
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        return nums;
    }
}
