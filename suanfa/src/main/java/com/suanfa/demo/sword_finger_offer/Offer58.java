package com.suanfa.demo.sword_finger_offer;

import java.util.Arrays;

/**
 * Description 剑指 Offer 58 - II. 左旋转字符串
 * Create by 汪迎春
 * Date 2021/8/30 7:22 下午
 */
public class Offer58 {

    public static void main(String[] args) {
        String str = "";
        System.out.println(reverseLeftWords(str, 7));
    }

    public static String reverseLeftWords(String s, int n) {
        if (s == null || n == 0 || s.length() <= n) {
            return s;
        }

        int len = s.length();
        char[] arr1 = new char[n];
        char[] arr2 = new char[len - n];
        int size = 0;
        for (int i = 0; i < len; i++) {
            if (i < n) {
                arr1[i] = s.charAt(i);
            } else {
                arr2[size++] = s.charAt(i);
            }
        }
        String str1 = new String(arr1);
        String str2 = new String(arr2);
        return str2.concat(str1);
    }

}
