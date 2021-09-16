package com.suanfa.demo.data_structure;

import java.util.Arrays;

/**
 * Description 插入排序
 * Create by 汪迎春
 * Date 2021/8/2 4:52 下午
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 1, 2, 6};
        System.out.println(Arrays.toString(sort(arr)));
    }

    public static int[] sort(int[] arr) {
        int len = arr.length;
        for (int i = 1; i < len; i++) {
            int current = arr[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (arr[j] > current) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + 1] = current;
        }
        return arr;
    }


}
