package com.suanfa.demo.sword_finger_offer;

import java.util.HashMap;
import java.util.Map;

/**
 * Description 剑指 Offer 03. 数组中重复的数字
 * Create by 汪迎春
 * Date 2021/8/30 7:49 下午
 */
public class Offer03 {
    public static void main(String[] args) {
//        int[] arr = {1, 3, 4, 5, 6, 7, 5, 3, 2};
        int[] arr = {1, 3, 3,2};
        System.out.println(findRepeatNumber(arr));
    }

    public static int findRepeatNumber(int[] nums) {
        int len = nums.length;
        int i = 0;
        while (i < len) {
            if (nums[i] == i) {
                i++;
                continue;
            }
            if (nums[nums[i]] == nums[i]) {
                return nums[i];
            }
            int tmp = nums[i];
            nums[i] = nums[tmp];
            nums[tmp] = tmp;
        }
        return -1;
    }

    /**
     * <p>
     *     1,0,1,4,3,2
     *     0,1,1,4,3,2
     *
     *     1,3,3,2
     *     3,1,3,2
     *     2,1,3,3
     *
     *
     *
     *     3,1,2,3
     *
     * </p>
     *
     */

}
