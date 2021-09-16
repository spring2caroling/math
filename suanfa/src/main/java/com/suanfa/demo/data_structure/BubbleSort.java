package com.suanfa.demo.data_structure;

import java.util.Arrays;

/**
 * Description 冒泡排序
 * Create by 汪迎春
 * Date 2021/8/2 4:27 下午
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 1, 2, 6};
        System.out.println(Arrays.toString(sort(arr)));
    }

    public static int[] sort(int[] arr) {
        int len = arr.length;
        int count = 0;

        for (int i = 0; i < len; i++) {
            boolean flag = false;

            for (int j = 0; j < len - i - 1; j++) {
                count++;
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }

            if (!flag) {
                break;
            }
        }
        System.out.println("总计算次数" + count);

        return arr;
    }


}
