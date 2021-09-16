package com.suanfa.demo.math;

/**
 * Description Z字形变换
 * Create by 汪迎春
 * Date 2021/6/21 9:26 上午
 */
public class Math3 {

    public static String convert(String s, int numRows) {
        if (numRows < 2 || s == null || s.length() == 0) {
            return s;
        }
        StringBuilder[] stringBuilders = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            stringBuilders[i] = new StringBuilder();
        }

        int count = 0;
        int label = 1;
        for (int i = 0; i < s.length(); i++) {
            stringBuilders[count].append(s.charAt(i));
            count += label;
            if (count == numRows - 1) {
                label = -1;
            }
            if (count==0) {
                label = 1;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (StringBuilder stringBuilder : stringBuilders) {
            sb.append(stringBuilder);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "";
        int numrows = 3;

        System.out.println(convert(s, numrows));

    }
}
