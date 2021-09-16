package com.suanfa.demo.math;

/**
 * Description 两个正序数组的中位数
 * Create by 汪迎春
 * Date 2021/6/19 10:17 下午
 */
public class Math2 {

    public static void main(String[] args) {
        int[] nums1 = {0};
        int[] nums2 = {1};
        System.out.println(findMedianSortedArrays(nums1,nums2));

    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m, n;
        if ((nums1 == null || nums1.length == 0) && (nums2 == null||nums2.length==0)) {
            return 0.0;
        }
        if (nums1 == null || nums1.length == 0) {
            return arrMid(nums2);
        }
        if (nums2 == null || nums2.length == 0) {
            return arrMid(nums1);
        }

        m = nums1.length;
        n = nums2.length;
        int[] tmp = new int[m + n];
        merge(m, n, nums1, nums2, tmp);
        return arrMid(tmp);
    }

    private static void merge(int m, int n, int[] nums1, int[] nums2, int[] tmp) {
        int i = 0, j = 0, t = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                tmp[t++] = nums1[i++];
            }
            else{
                tmp[t++] = nums2[j++];
            }
        }

        while (i < m) {
            tmp[t++] = nums1[i++];
        }

        while (j < n) {
            tmp[t++] = nums2[j++];
        }
    }

    private static double arrMid(int[] arr) {

        int length = arr.length;
        // 如果偶数个
        if (length % 2 == 0) {
            return new Double((arr[length / 2 - 1] + arr[length / 2])) / new Double(2);
        } else {
            return new Double(arr[length / 2]);
        }
    }

}
