package com.suanfa.demo.data_structure;

import java.util.Arrays;

/**
 * Description 快排
 * Create by 汪迎春
 * Date 2021/8/4 10:54 上午
 */
public class QuickSort_01 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 8};
//        int[] arr = {5, 3, 2, 1, 6, 5};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        int len = arr.length;
        int left = 0;
        int right = arr.length - 1;
        quickSort(arr, left, right);
    }

    private static void quickSort(int[] arr, int left, int right) {
        //终止条件
        if (left>=right) {
            return;
        }
        int index = getIndex(arr, left, right);
        quickSort(arr, left, index - 1);
        quickSort(arr, index+1, right);
    }

    private static int getIndex(int[] arr, int left, int right) {
        int current = arr[left];
        int currentIndex = left;
        while (left < right) {
            while (left < right && arr[right] <= current) {
                right--;
            }
            while (left < right && arr[left] >= current) {
                left++;
            }
            if (left < right) {
                int tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
            } else {
                //换下一个index
                int tmp = arr[left];
                arr[left] = current;
                arr[currentIndex] = tmp;
                currentIndex = left;
            }
        }
        return currentIndex;
    }
}
