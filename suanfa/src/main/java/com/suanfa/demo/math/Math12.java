package com.suanfa.demo.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Description
 * Create by 汪迎春
 * Date 2021/7/6 8:50 下午
 */
public class Math12 {

    public static void main(String[] args) {
//        int[] arr = {-1,0,1,2,-1,-4};
        int[] arr = {-1, 0, 3, -2, -1, -3};


//        int[] arr = {0};
        System.out.println(threeSum(arr));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        if (nums==null||nums.length==0) {
            return list;
        }
        if (nums.length < 3) {
            return list;
        }
        int[] sortedNums = sortArr(nums);
//         双指针
        int i = 0, j = sortedNums.length - 1;
        while ((i <= j) && sortedNums[i] <= 0 && sortedNums[j] >= 0) {
            int left = sortedNums[i];
            int right = sortedNums[j];
            // 如果两边相等，看相邻元素是否 有可能组成组合
            if (Math.abs(left) == right) {

            }



            // 左边大
            if (Math.abs(left) > right) {
                int rightTemp = 1;
                // 右边两个数加起来大
                while ((j - rightTemp) >= i && sortedNums[j] + sortedNums[j - rightTemp] > Math.abs(left)) {
                    rightTemp++;
                }
                if (sortedNums[j] + sortedNums[j - rightTemp] == Math.abs(left)) {
                    list.add(Arrays.asList(sortedNums[j], sortedNums[j - rightTemp], sortedNums[left]));
                }
                i++;
            } else {
                // 右边大
                int leftTemp = 1;
                while ((i + leftTemp) <= j && Math.abs(sortedNums[i] + sortedNums[i + leftTemp]) > sortedNums[j]) {
                    leftTemp++;
                }
                if (Math.abs(sortedNums[i] + sortedNums[i + leftTemp]) == sortedNums[j]) {
                    list.add(Arrays.asList(sortedNums[i], sortedNums[i + leftTemp], sortedNums[j]));
                }
                j--;
            }
        }
        return list;
    }

    // 归并排序
    private static int[] sortArr(int[] nums) {
        int[] temp = new int[nums.length];
        sort(nums, 0, nums.length - 1, temp);
        return nums;
    }

    private static void sort(int[] nums, int start, int end, int[] temp) {
        if (start < end) {
            int mid = (end + start) / 2;
            // 排序左边
            sort(nums, start, mid, temp);
            sort(nums, mid + 1, end, temp);
            // 归并
            merge(nums, start, mid, end, temp);
        }
    }

    private static void merge(int[] nums, int start, int mid, int end, int[] temp) {
        int i = start;
        int j = mid + 1;
        int t = 0;
        while (i <= mid && j <= end) {
            if (nums[i] <= nums[j]) {
                temp[t++] = nums[i++];
            } else {
                temp[t++] = nums[j++];
            }
        }

        while (i <= mid) {
            temp[t++] = nums[i++];
        }

        while (j <= end) {
            temp[t++] = nums[j++];
        }

        t = 0;
        while (start <= end) {
            nums[start++] = temp[t++];
        }
    }


}
