package com.suanfa.demo.sword_finger_offer;

/**
 * Description 剑指 Offer 05. 替换空格
 * Create by 汪迎春
 * Date 2021/8/30 6:41 下午
 */
public class Offer05 {
    public static void main(String[] args) {

    }

    public static String replaceSpace(String s) {
        if (s==null) {
            return null;
        }

        int len = s.length();

        char[] arr = new char[len * 3];
        int size = 0;

        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == ' ') {
                arr[size++] = '%';
                arr[size++] = '2';
                arr[size++] = '0';
            } else {
                arr[size++] = s.charAt(i);
            }
        }
        return new String(arr, 0, size);
    }


}
