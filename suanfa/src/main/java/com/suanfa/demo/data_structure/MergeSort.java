package com.suanfa.demo.data_structure;

import java.util.Arrays;

/**
 * Description 归并排序
 * Create by 汪迎春
 * Date 2021/8/3 11:32 上午
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {6, 3, 1, 8, 4};
        System.out.println(Arrays.toString(sort(arr)));
    }

    public static int[] sort(int[] arr) {
        int len = arr.length;
        int[] temp = new int[len];
        int left = 0;
        int right = len - 1;
        mergesort(arr, left, right, temp);
        return arr;
    }

    private static void mergesort(int[] arr, int left, int right, int[] temp) {
        //递归终止条件
        if (left >= right) {
            return;
        }
        int mid = (right - left) / 2 + left;
        //地推公式
        mergesort(arr, left, mid, temp);
        mergesort(arr, mid + 1, right, temp);
        merge(arr, left, mid, right, temp);
    }

    //归并
    private static void merge(int[] arr, int left, int mid, int right, int[] temp) {
        int i = left;
        int j = mid + 1;
        int t = 0;
        while (i <= mid && j <= right) {
            if (arr[i] > arr[j]) {
                temp[t++] = arr[j++];
            } else {
                temp[t++] = arr[i++];
            }
        }
        //右边已经全部放入数组
        while (i <= mid) {
            temp[t++] = arr[i++];
        }
        //左边已经全部放入数组
        while (j <= right) {
            temp[t++] = arr[j++];
        }
        //copy到原数组 这一步要理解透
        t = 0;
        while (left <= right) {
            arr[left++] = temp[t++];
        }
    }


}
