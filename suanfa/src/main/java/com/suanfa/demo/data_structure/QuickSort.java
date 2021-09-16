package com.suanfa.demo.data_structure;

import java.util.Arrays;

/**
 * Description 快递排序
 * Create by 汪迎春
 * Date 2021/8/4 9:45 上午
 */
public class QuickSort {
    public static void main(String[] args) {
//        int[] arr = {8, 3, 5, 6, 4, 1};
        int[] arr = {1, 3, 4, 5, 6, 8};
        sort(arr);
    }

    public static void sort(int[] arr) {
        int len = arr.length;
        int left = 0;
        int right = len - 1;
        quickSort(arr, left, right);
        System.out.println(Arrays.toString(arr));

    }

    private static void quickSort(int[] arr, int left, int right) {
        //终止条件
        if (left>=right) {
            return;
        }
        //获取基准位置
        int index = getIndex(arr, left, right);
        quickSort(arr, left, index - 1);
        quickSort(arr, index + 1, right);
    }

    private static int getIndex(int[] arr, int low, int high) {
        int temp = arr[low];
        while (low < high) {
            //如果高位大于temp
            while (low < high && arr[high] <= temp) {
                high--;
            }
            //如果高位小于temp，将高位赋值到地位
            arr[low] = arr[high];
            while (low < high && arr[low] >= temp) {
                low++;
            }
            arr[high] = arr[low];
        }
        arr[low] = temp;
        return low;
    }
}
