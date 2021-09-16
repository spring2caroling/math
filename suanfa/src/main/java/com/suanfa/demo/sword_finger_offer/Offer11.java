package com.suanfa.demo.sword_finger_offer;

/**
 * Description 剑指 Offer 11. 旋转数组的最小数字
 * Create by 汪迎春
 * Date 2021/9/1 9:57 上午
 */
public class Offer11 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
//        2,2,2,2,2,2,0,1,2,2
        System.out.println(minArray(arr));

    }

    public static int minArray(int[] numbers) {
        int len = numbers.length;
        int left = 0;
        int right = len - 1;

        while (left < right) {
            int mid = left + ((right - left) >> 1);
            if (numbers[mid] < numbers[right]) {
                //理解这个为啥不是mid-1,因为这个最小值有可能就是mid
                right = mid;
            } else if (numbers[mid] > numbers[right]) {
                left = mid + 1;
            } else {
                right--;
            }
        }
        return numbers[right];
    }
}
