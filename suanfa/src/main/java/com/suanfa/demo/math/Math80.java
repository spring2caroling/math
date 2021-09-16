package com.suanfa.demo.math;

/**
 * Description 删除有序数组中的重复项
 * Create by 汪迎春
 * Date 2021/8/24 6:45 下午
 */
public class Math80 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3,4,4,5};
        System.out.println(removeDuplicates(arr));
    }

    public static int removeDuplicates(int[] nums) {
        int len = nums.length;
        if (len<=2) {
            return len;
        }
        //要保留数组长度
        int slow = 2;
        //检查过的数组的长度
        int fast = 2;

        while (fast < len) {
            //如果不相同就保留，可以设想通用性，保留k个相同元素，数组有序，只要当前元素跟 前k元素不同就可以保留
            if (nums[slow - 2] != nums[fast]) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }


}
