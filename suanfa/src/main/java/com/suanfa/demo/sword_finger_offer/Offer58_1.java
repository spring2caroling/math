package com.suanfa.demo.sword_finger_offer;

/**
 * Description 剑指 Offer 58 - I. 翻转单词顺序
 * Create by 汪迎春
 * Date 2021/9/18 9:04 上午
 */
public class Offer58_1 {
    public static void main(String[] args) {
        String str = "  hello world!  ";
        System.out.println(reverseWords(str));

    }

    public static String reverseWords(String s) {
        s = s.trim();
        int i = s.length() - 1;
        int j = i;

        StringBuilder sb = new StringBuilder();
        while (j >= 0) {
            while (j >= 0 && s.charAt(j) != ' ') {
                j--;
            }
            sb.append(s.substring(j + 1, i + 1) + " ");
            while (j >= 0 && s.charAt(j) == ' ') {
                j--;
            }
            i = j;
        }
        return sb.toString();

    }
}
