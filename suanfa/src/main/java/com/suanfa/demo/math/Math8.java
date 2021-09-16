package com.suanfa.demo.math;

/**
 * Description
 * Create by 汪迎春
 * Date 2021/7/3 10:44 下午
 */
public class Math8 {
    public static void main(String[] args) {
        int[] arr = new int[] {2,3,4,5,18,17,6};
        System.out.println(maxArea(arr));
    }



//    public static int maxArea(int[] height) {
//        int maxVolume = 0;
//
//        for (int i = 0; i < height.length; i++) {
//            for (int j = i + 1; j < height.length; j++) {
//                maxVolume = Math.max(maxVolume, (j - i) * Math.min(height[i], height[j]));
//            }
//        }
//        return maxVolume;
//
//    }

    /**
     * 双指针
     * @param height
     * @return
     */
    public static int maxArea(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        int left = 0;
        int right = height.length - 1;
        int maxVolume = 0;
        while (left < right) {
            maxVolume = Math.max(maxVolume, Math.min(height[left], height[right]) * (right - left));
            if (height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxVolume;
    }
}
