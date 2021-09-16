package com.suanfa.demo.math;

/**
 * Description
 * Create by 汪迎春
 * Date 2021/7/4 10:12 下午
 */
public class Math9 {
    public static void main(String[] args) {
        System.out.println(intToRoman(1994));

    }

    // TODO: 2021/7/4 看一下一些优秀的题解，学习下贪心算法的思想
    public static String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] valueStrs = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            int value = values[i];
            String valStr = valueStrs[i];
            while (num >= value) {
                num -= value;
                sb.append(valStr);
            }
        }
        return sb.toString();
    }
}
